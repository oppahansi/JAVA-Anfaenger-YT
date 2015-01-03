/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode028;

public class Ternary {

   public static void main(String[] args) {
      /**
       * conditional / ternary - Syntax
       *
       * (condition) ? value_if_true : value_if_false;
       *
       * variable = (condition) ? value_if_true : value_if_false;
       *
       * //<<---------------------------------------------->>//
       *
       * expressed as if:
       *
       * if (condition) {
       *    // if condition is true
       * }
       * else {
       *    // if condition is false
       * }
       */

      boolean testTernary;

      testTernary = (10 > 5) ? true : false;

      int testTermaryWithInt;

      testTermaryWithInt = 5 > 3 ? 42 : 1337;

      System.out.println("testTernary has the value : " + testTernary);
      System.out.println("testTernaryInMethod returns the value : " + testTernaryInMethod());
      System.out.println("testTernaryWithInt has the value : " + testTermaryWithInt);
      System.out.println("testTernaryAsIntInMethod returns the value : " + testTernaryAsIntInMethod());

   }

   public static boolean testTernaryInMethod() {
      return (10 < 5) ? true : false;
   }

   public static int testTernaryAsIntInMethod() {
      return 5 > 3 ? 42 : 1337;
   }

}