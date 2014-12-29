/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode20;

public class SwitchStatement {

   public static void main(String[] args) {
      /**
       * switch statement - Syntax
       *
       * switch(expression) {
       *    case value:
       *
       *       // Statements
       *       break;            // optional
       *
       *    case value:
       *
       *       // Statements
       *
       *    default:             // optional
       *
       *       // Statements
       * }
       *
       * expression has to be: byte, short, char, int, String(since JDK 1.7!)
       */

      byte example = 42;

      switch (example) {
         case 0:
            System.out.println("Example has the value " + example);
            break;
         case 42:
            System.out.println("The answer to everything is " + example);
            break;
         default:
            System.out.println("(optional) Default execution block ");
      }
   }
}