
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Client;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\003\004" +
    "\000\002\003\003\000\002\003\003\000\002\006\003\000" +
    "\002\004\005\000\002\004\005\000\002\005\005\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\012\003\013\004\011\010\005\011\014\001" +
    "\002\000\012\003\015\004\011\010\005\011\014\001\002" +
    "\000\032\005\036\006\030\012\024\013\035\014\031\015" +
    "\027\016\032\017\034\020\033\021\025\022\022\023\023" +
    "\001\002\000\012\003\015\004\011\010\005\011\014\001" +
    "\002\000\004\002\020\001\002\000\012\003\013\004\011" +
    "\010\005\011\014\001\002\000\012\003\ufffb\004\ufffb\010" +
    "\ufffb\011\ufffb\001\002\000\012\003\015\004\011\010\005" +
    "\011\014\001\002\000\014\002\uffff\003\ufffa\004\ufffa\010" +
    "\ufffa\011\ufffa\001\002\000\012\003\ufff9\004\ufff9\010\ufff9" +
    "\011\ufff9\001\002\000\012\003\ufffa\004\ufffa\010\ufffa\011" +
    "\ufffa\001\002\000\012\003\ufffe\004\ufffe\010\ufffe\011\ufffe" +
    "\001\002\000\004\002\000\001\002\000\004\002\001\001" +
    "\002\000\012\003\ufffd\004\ufffd\010\ufffd\011\ufffd\001\002" +
    "\000\004\007\uffed\001\002\000\004\007\uffec\001\002\000" +
    "\004\007\ufff5\001\002\000\004\007\uffee\001\002\000\004" +
    "\007\041\001\002\000\004\007\ufff2\001\002\000\004\007" +
    "\040\001\002\000\004\007\ufff3\001\002\000\004\007\ufff1" +
    "\001\002\000\004\007\uffef\001\002\000\004\007\ufff0\001" +
    "\002\000\004\007\ufff4\001\002\000\004\007\037\001\002" +
    "\000\012\003\ufff8\004\ufff8\010\ufff8\011\ufff8\001\002\000" +
    "\012\003\ufff7\004\ufff7\010\ufff7\011\ufff7\001\002\000\012" +
    "\003\ufff6\004\ufff6\010\ufff6\011\ufff6\001\002\000\012\003" +
    "\ufffc\004\ufffc\010\ufffc\011\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\040\000\014\002\006\003\007\004\005\005\011\006" +
    "\003\001\001\000\012\003\041\004\005\005\011\006\003" +
    "\001\001\000\004\007\025\001\001\000\012\003\020\004" +
    "\005\005\011\006\003\001\001\000\002\001\001\000\014" +
    "\002\016\003\007\004\005\005\011\006\003\001\001\000" +
    "\002\001\001\000\012\003\015\004\005\005\011\006\003" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
	public parser(Lexema lexer) {
        super(lexer);
        }

        public void syntax_error(Symbol cur_token) {
        //System.out.println("El error es el simbolo: " + sym.terminalNames[cur_token.sym]);
        //System.out.println(String.format("En la posicion: %d, %d", cur_token.left, cur_token.right));
        }

        public void unrecovered_syntax_error(Symbol cur_token) {
            if (cur_token.sym == sym.EOF) {
             System.out.println("public void unrecoveredsyntax_error!!!!!!!!!!!!!!");
            }
        }
    /*
    code
     */
    private ListSimple<Bet> listBet;
    private String name;
    private int[] horse = null;
    private int conter = 10;
    private double money = 0;

    private void restart() {
        this.conter = 10;
        this.money = 0;
        this.horse = null;
        this.name = "";
    }// 4  = > o(1)

    private void insertHorse(int add) {
        if (this.horse == null) {
            this.horse = new int[this.conter];
            this.horse[this.conter - 1] = add;
        }
        if (this.conter >= 1) {
            this.horse[this.conter - 1] = add;
        }
        this.conter--;
    }// 5  = > o(1)

    private void addBet() {
        boolean checker = (this.conter < 10) && (this.money > 0) && (this.horse != null) && (!this.name.isBlank());
        if (checker) {
            if (listBet==null) {
                listBet = new ListSimple<>(new Bet(new Client(name),horse,money));
            } else {
            }
            listBet.add(new Bet(new Client(name),horse,money));
        }
        restart();
    }// 12  = > o(1)
     public ListSimple<Bet> getListBet() {
        return listBet;
    }
    /*
    code
     */



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= i EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // i ::= d i 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("i",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // i ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("i",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // d ::= c d 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // d ::= m d 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // d ::= n d 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // d ::= SALTO 
            {
              Object RESULT =null;
		addBet();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // d ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("d",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // n ::= NOMBRE 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		name = e.toString();
              CUP$parser$result = parser.getSymbolFactory().newSymbol("n",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // m ::= MENOR MONTO MAYOR 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		money = Double.valueOf(m.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // m ::= MENOR ENTERO MAYOR 
            {
              Object RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object m = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		money = Double.valueOf(m.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("m",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // c ::= MENOR l MAYOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("c",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // l ::= TENTH 
            {
              Object RESULT =null;
		insertHorse(10);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // l ::= NINTH 
            {
              Object RESULT =null;
		insertHorse(9);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // l ::= EIGHTH 
            {
              Object RESULT =null;
		insertHorse(8);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // l ::= SEVENTH 
            {
              Object RESULT =null;
		insertHorse(7);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // l ::= SIXTH 
            {
              Object RESULT =null;
		insertHorse(6);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // l ::= FIFTH 
            {
              Object RESULT =null;
		insertHorse(5);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // l ::= FOURTH 
            {
              Object RESULT =null;
		insertHorse(4);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // l ::= THIRD 
            {
              Object RESULT =null;
		insertHorse(3);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // l ::= SECOND 
            {
              Object RESULT =null;
		insertHorse(2);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // l ::= FIRST 
            {
              Object RESULT =null;
		insertHorse(1);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
