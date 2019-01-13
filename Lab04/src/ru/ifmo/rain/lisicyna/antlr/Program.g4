grammar Program;

@header {
import java.util.*;
}

@parser::members {
class Node {
    String name;
    List<List<String>> seqs = new ArrayList<>();
    boolean isTerminal;

    public Node(String name) {
        this.name = name;
    }
}

List<Node> terminals = new ArrayList<>();
Map<String, Node> nodes = new HashMap<>();
Map<String, String> literals = new HashMap<>();
}

program : 'grammar' NameChar+ ';' '\n' rule+;

rule returns [Node node]
     : nameRule ':' description {
     Node node = new Node($nameRule.s);
     node.isTerminal = false;
     node.seqs.add($description.s);}
     ('\n' '|' description {node.seqs.add($description.s);})* ';\n'
     | nameID ':' descriptionID {
      Node node = new Node($nameID.s);
      node.isTerminal = true;
      node.seqs.add($descritptionID.s);}
      ('\n' '|' descriptionID {node.seqs.add($description.s);})* ';\n';

nameRule returns [String s]
         : NameRuleStart {$s = $NameRuleStart.getText();} (NameChar {$s += $NameChar.getText();})*;

description returns [List<String> s]
            @init {
                $s = new ArrayList<>();
            }
            : ((nameID {$s.add($nameID.s);}
              | symbol {
              if (literals.containsKey($symbol.s)) {
                  $s.add(literals.get($symbol.s));
              } else {
                  Node node = new Node("T_" + literals.keySet().size());
                  node.isTerminal = true;
                  List<String> temp = new ArrayList<>();
                  temp.add($symbol.s);
                  node.seqs.add(temp);
                  literals.put($symbol.s, node.name);
                  nodes.put(node.name, node);
              }
              }
              | nameRule{$s.add($nameRule.s);}) ('+' {$s.get(s.size() - 1) += "+";} | '*' {$s.get(s.size() - 1) += "*";}| '?' {$s.get(s.size() - 1) += "?";})?)+;

nameID returns [String s]
       : NameIDStart NameChar* {$s = $NameIDStart.getText();};

descriptionID returns [List<String> s]
              @init {
              s = new ArrayList<>();
              }
              : a=symbol   {
              $s.add($a.s);
              }
              | '\'' b=Symbol '\'' '..' '\'' c=Symbol '\''
              {$s.add("'" + $b.getText() + "'..'" + $c.getText() + "'");};

symbol returns [String s]
       : '\'' String '\'' {$s = $String.getText();};

String : Symbol+;

NameChar : NameRuleStart
         | NameIDStart
         | '0'..'9'
         | '_';

NameRuleStart : 'a'..'z';

NameIDStart : 'A'..'Z';

Symbol : '\u0021'..'\u007E'
       | WhiteSpace;

WhiteSpace : ' '
           | '\n'
           | '\b'
           | '\r'
           | '\t';

WS : [ \t\r\n]+ -> skip;