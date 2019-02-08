grammar Program;

@header {
import java.util.*;
}

@parser::members {
public class Node {
    public String name;
    public List<List<Map.Entry<String, Map.Entry<String, String>>>> seqs = new ArrayList<>();
    public boolean isTerminal;
    public String inhVars;
    public String synVars;
    public String initCode;

    public Node(String name) {
        this.name = name;
    }
}

List<Node> terminals = new ArrayList<>();
Map<String, Node> nodes = new HashMap<>();
Map<String, String> literals = new HashMap<>();
}

program : begin header? members? rule+;

header returns [String s]
       : '@header' Code '@header' NL {$s = $Code.getText();};

members returns [String s]
        @init {
        $s = "";
        }
        : '@members' NL (a = AllCode {$s +=$a.getText();}) NL '@members' NL;

begin :  'start' '=' nameRule ';' NL;

rule returns [Node node]
     @init {
     String s = null, s1 = null;
     }
     : nameRule Var? (synVar {s = $synVar.s;})? ':' (init {s1 = $init.s;})? description {
     $node = new Node($nameRule.s);
     $node.isTerminal = false;
     if ($Var != null) $node.inhVars = $Var.getText();
     $node.synVars = s;
     $node.initCode = s1;
     $node.seqs.add($description.s);}
     (NL '|' description {$node.seqs.add($description.s);})* ';' NL
     | nameID ':' descriptionID {
      $node = new Node($nameID.s);
      $node.isTerminal = true;
      $node.seqs.add($descriptionID.s);}
      (NL '|' descriptionID {$node.seqs.add($descriptionID.s);})* ';'NL;

init returns [String s]
     : '@init' Code {$s = $Code.getText();};

synVar returns [String s]
       : 'returns' Var {$s = $Var.getText();};

nameRule returns [String s]
         : NameRule {$s = $NameRule.getText();};

description returns [List<Map.Entry<String, Map.Entry<String, String>>> s]
            @init {
                $s = new ArrayList<>();
            }
            : (nameRule Var?  Code?{
              String s = null;
              if ($Code != null) s = $Code.getText();
              String s1 = null;
              if ($Var != null) s1 = $Var.getText();
              $s.add(new AbstractMap.SimpleEntry<>($nameRule.s, new AbstractMap.SimpleEntry<>(s, s1)));}
              | nameID Code? {
              String s = null;
              if ($Code != null) s = $Code.getText();
              $s.add(new AbstractMap.SimpleEntry<>($nameID.s, new AbstractMap.SimpleEntry<>(s, null)));})+;

nameID returns [String s]
       : NameID{$s = $NameID.getText();};

descriptionID returns [List<Map.Entry<String, Map.Entry<String, String>>> s]
              @init {
              $s = new ArrayList<>();
              }
              : Regex {
              $s.add(new AbstractMap.SimpleEntry<>($Regex.getText(), null));
              };

symbol returns [String s]
       :  String   {$s = $String.getText();};

Regex : '\'' (~('\''|'\r' | '\n') | '\\\'')* '\'';
AllCode : '#' (~[#]+)* '#';

Start : 'start';

NameRule : [a-z][a-zA-Z0-9_]*;

NameID : [A-Z][a-zA-Z0-9_]*;


String :  '"'(~('"') | '\\"')*'"' ;

Code : '{' (~[{}])* '}';

Var : '<' (~[<>])* '>';



//WhiteSpace : ' '
  //         | '\n'
    //       | '\b'
      //     | '\r'
        //   | '\t';

NL : '\r'? '\n';

WS : [ \t\r\n]+ -> skip;

