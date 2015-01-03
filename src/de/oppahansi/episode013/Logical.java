/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode013;

public class Logical {
   public static void main(String[] args) {
      /**
       * Logical Operators:
       *
       * && , || , !
       */

      /**   - && -
       A       B      Result
       TRUE  | TRUE  | TRUE
       TRUE  | FALSE | FALSE
       FALSE | TRUE  | FALSE
       FALSE | FALSE | FALSE
       */

      /**   - || -
       A       B      Result
       TRUE  | TRUE  | TRUE
       TRUE  | FALSE | TRUE
       FALSE | TRUE  | TRUE
       FALSE | FALSE | FALSE
       */

      /**   - ! -
       A       Result
       TRUE  | FALSE
       FALSE | TRUE
       */

      boolean trueValue = true;
      boolean falseValue = false;

      System.out.println("Logical Operators - Beispiele\n");
      System.out.println("trueValue && falseValue = " + (trueValue && falseValue));    // logical AND
      System.out.println("trueValue || falseValue = " + (trueValue || falseValue));    // logical OR
      System.out.println("!(trueValue && falseValue) = " + !(trueValue && falseValue));// logical NOT
      System.out.println("!trueValue = " + (!trueValue));// logical NOT

      /**
       * Nachtrag zur Episode 11
       */

      int A = 10;
      int B = 20;

      System.out.println("A >= B : " + (A >= B));                    // Is A greater or equal to B?

      // (A >= B)  ->  ((A > B) || (A == B))   ->   Andere schreibweise
   }
}