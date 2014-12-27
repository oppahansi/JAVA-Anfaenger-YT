/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode3;

public class Misc {
   public static void main(String[] args) {
      /**
       * Misc Operators:
       *
       * - (condition) ? valueIfTrue : valueIfFalse
       * - (instanceof) (later)
       */

      boolean trueValue = true;
      boolean falseValue = false;
      boolean testValue;

      System.out.println("Misc Operators - Beispiele\n");
      testValue = (trueValue == falseValue) ? true : false;             // Conditional Operator ? / Ternary
      System.out.println("(Condition) ? value if true : value if false");
      System.out.println("trueValue == falseValue -> false");
      System.out.println("testValue = " + testValue);
   }
}