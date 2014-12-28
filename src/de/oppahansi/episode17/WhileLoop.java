/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode17;

public class WhileLoop {

   public static void main(String[] args) {
      /**
       * The while-Loop - Syntax
       *
       * while (booleanExpression) {
       *    // Statements
       * }
       */

      int counter = 1;

      while (counter < 6) {
         System.out.println("Do stuff 5 times... " + counter);
         counter++;
      }

      /**
       * Uebung 1:
       * Verwandle diese while-Schleife in eine for-Schleife.
       * Verwandle eine der for-Schleifen aus Episode 16 in eine
       * while-Schleife.
       */

      /**
       * Uebung 2:
       * Was passiert, wenn man bei der o.g. while-Schleife statt
       * (Zeile 23) counter++;  ->  counter--; benutzt oder counter++; weglässt?
       */
   }
}