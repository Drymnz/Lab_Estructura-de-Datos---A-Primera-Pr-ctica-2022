/*primer seccion: codigo de usuario*/
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup;

import java_cup.runtime.*;
%%
/*segunda seccion: configuracion*/
%class Lexema
%unicode
%line
%column
%cup
%public
ENTERO = [0-9]*
DECIMAL = {ENTERO}*[.]{ENTERO}*
ESPACIO = [\r|\t|\f|\s|]+
SALTO = [\n]
%%
/*tercer seccion: reglase lexicas*/
{ESPACIO }           {/*nada*/}
/*Token*/
">"                 {
                     return new Symbol(sym.MENOR,yyline,yycolumn, (yytext()));
                    }
"<"                 {
                    return new Symbol(sym.MAYOR,yyline,yycolumn, (yytext()));
                    }
"<".*">"            {
                    return new Symbol(sym.NOMBRE,yyline,yycolumn, (yytext())); 
                    }
"1"                 {
                    return new Symbol(sym.FIRST,yyline,yycolumn, (yytext()));
                    }
"2"                 {
                    return new Symbol(sym.SECOND,yyline,yycolumn, (yytext()));
                    }
"3"                 {
                    return new Symbol(sym.THIRD,yyline,yycolumn, (yytext()));
                    }
"4"                 {
                    return new Symbol(sym.FOURTH,yyline,yycolumn, (yytext()));
                    }
"5"                 {
                    return new Symbol(sym.FIFTH,yyline,yycolumn, (yytext()));
                    }
"6"                 {
                    return new Symbol(sym.SIXTH,yyline,yycolumn, (yytext()));
                    }
"7"                 {
                    return new Symbol(sym.SEVENTH,yyline,yycolumn, (yytext()));
                    }
"8"                 {
                    return new Symbol(sym.EIGHTH,yyline,yycolumn, (yytext()));
                    }
"9"                 {
                    return new Symbol(sym.NINTH,yyline,yycolumn, (yytext()));
                    }
"10"                 {
                    return new Symbol(sym.TENTH,yyline,yycolumn, (yytext()));
                    }
{ENTERO}           {
                    return new Symbol(sym.ENTERO,yyline,yycolumn, (yytext())); 
                    }
{DECIMAL}           {
                    return new Symbol(sym.MONTO,yyline,yycolumn, (yytext())); 
                    }
","                 {}
{SALTO}            {
                    return new Symbol(sym.SALTO,yyline,yycolumn, (yytext())); 
                    }

/*ERROR LEXICO*/
.                   {
                    //error
                    }
