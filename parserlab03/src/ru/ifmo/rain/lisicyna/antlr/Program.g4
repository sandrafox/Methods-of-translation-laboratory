grammar Program;

@header {
import java.util.*;
import java.io.*;
}

@parser::members {
String TAB = "    ";
public BufferedWriter w;

String eval2(int op, String left, String right) {
    String res = "(" + left + " ";
    switch (op) {
        case MUL : res += "*"; break;
        case DIV : res += "/"; break;
        case ADD : res += "+"; break;
        case SUB : res += "-"; break;
        case AND : res += "&&"; break;
        case OR : res += "||"; break;
        case XOR : res += "^"; break;
        case LT : res += ">"; break;
        case TT : res += "<"; break;
        case EQ : res += "=="; break;
        case NE : res += "!="; break;
        case LTE : res += ">="; break;
        case TTE : res += "<="; break;
        case SR : res += ">>"; break;
        case SL : res += "<<"; break;
    }
    res += " " + right + ")";
    return res;
}
}

s : program [2] EOF
   {
   try {
       w.write("public class Main {\n    public static void main(String[] args){\n" + $program.v + "    }\n}\n");
       w.close();
   } catch (IOException e) {}
   }
  | {
     try {
         w.write("public class Main {\n}\n");
     } catch (IOException e) {}
     };

program [int tabs] returns [String v]
        : operation [$tabs]
                  {
                  $v = $operation.v + "\n";
                  }
        | operation [$tabs] ' ' program [$tabs]
          {
          $v = $program.v + "\n" + $operation.v;
          }

        ;

ifend [int tabs] returns [String v, boolean c]
      : {$start != null && _input.LT($start.getTokenIndex() + 1).getType() != 4}? ' ' b=operation [$tabs + 1]
        {
        $v = "";
        for (int i = 0; i < $tabs; i++) {
                              $v += TAB;
                 }
                 $v += "else {\n" + $b.v + "\n";
                 for (int i = 0; i < $tabs; i++) {
                                               $v += TAB;
                                  }
                 $v += "}\n";
                 $c = $b.c;
                 }
      | {$v = "";
         $c = false;};

ifstat [int tabs] returns [String v, boolean c]
       : 'if' ' ' logExpr ' ' a=operation [$tabs + 1] ifend [$tabs]
         {
         $v = "";
         for (int i = 0; i < $tabs; i++) {
             $v += TAB;
         }
         $v += "if (" + $logExpr.v + ") {\n" + $a.v + "\n";
         for (int i = 0; i < $tabs; i++) {
             $v += TAB;
         }
         $v += "}\n";
         $v += $ifend.v;
         if ($ifend.v.equals(""))
             $c = $a.c;
         else
             $c = $ifend.c;
         };

operation [int tabs] returns [String v, boolean c]
          : a=assignment [$tabs]
            {
            $v = $a.v + ";";
            $c = true;
            }
          | 'begin' ' ' b=program [$tabs + 1] ' ' 'end'
            {
            $v = "";
            for (int i = 0; i < tabs; i++) {
                $v += TAB;
            }
            $v += "{\n" + $b.v;
            for (int i = 0; i < tabs; i++) {
                $v += TAB;
            }
            $v += "}";
            $c = false;
            }
          | 'print' ' ' expr
            {
            $v = "";
            for (int i = 0; i < tabs; i++) {
                $v += TAB;
            }
            $v += "System.out.println(" + $expr.v + ");";
            $c = true;
            }
          | ifstat [$tabs]
            {
            $v = $ifstat.v;
            if (!$ifstat.c)
               $v += ";";
            $c = true;
            };

assignment [int tabs] returns [String v]
           : '=' ' ' ID ' ' logExpr
             {
             $v = "";
             for (int i = 0; i < tabs; i++) {
                 $v += TAB;
             }
             $v += "boolean " + $ID.text + " = " + $logExpr.v;
             }
           | '=' ' ' ID ' ' mtExpr
             {
             $v = "";
             for (int i = 0; i < tabs; i++) {
                 $v += TAB;
             }
             $v += "int " + $ID.text + " = " + $mtExpr.v;
             }
           | '=' ' ' ID ' ' ST
             {
             $v = "";
             for (int i = 0; i < tabs; i++) {
                 $v += TAB;
             }
             $v += "String " + $ID.text + " = " + $ST.text;
             };

expr returns [String v]
     : logExpr {$v = $logExpr.v;}
     | mtExpr {$v = $mtExpr.v;}
     | ST {$v = $ST.text;};

logExpr returns [String v]
        : op=('&&'|'||'|'^') ' ' a=logExpr ' ' b=logExpr {$v = eval2($op.type, $a.v, $b.v);}
        | '!' ' ' a=logExpr {$v = "!" + $a.v;}
        | op=('>'|'<'|'=='|'>='|'<='|'!=') ' ' c=mtExpr ' ' d=mtExpr {$v = eval2($op.type, $c.v, $d.v);}
        | 'true' {$v = "true";}
        | 'false' {$v = "false";}
        | ID {$v = $ID.text;} ;

mtExpr returns [String v]
       : op=('+'|'-'|'*'|'/'|'>>'|'<<') ' ' a=mtExpr ' ' b=mtExpr {$v = eval2($op.type, $a.v, $b.v);}
       | INT {$v = $INT.text;}
       | ID {$v = $ID.text;};

INT : '-'? [0-9]+ ;
ID : [a-z]+ ;
WS : [ \t\r\n]+ -> skip;
ST : '"' [a-zA-Z0-9 \r\t\n]* '"' ;

AND : '&&' ;
OR : '||' ;
XOR : '^' ;
NOT : '!' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
LT : '>' ;
TT : '<' ;
EQ : '==' ;
LTE : '>=' ;
TTE : '<=' ;
NE : '!=' ;
SR : '>>' ;
SL : '<<' ;
