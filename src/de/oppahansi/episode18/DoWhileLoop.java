/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode18;

public class DoWhileLoop {

   public static void main(String[] args) {
      /**
       * The do-while-Loop - Syntax
       *
       *  do {
       *    // Statements
       * }
       * while (booleanExpression);
       */

      int counter = 6;

      do {
         System.out.println("Do stuff 5 times... " + counter);
         counter++;
      }
      while (counter < 6);
   }
}