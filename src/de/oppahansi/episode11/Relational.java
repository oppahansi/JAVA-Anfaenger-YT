/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode11;

public class Relational {

   public static void main(String[] args) {
      /**
       * Relational Operators:
       *
       * == , != , > , < , >= , <=
       *
       * -> Result: boolean (true / false)
       */

      int A = 10;
      int B = 20;

      System.out.println("Relational Operators - Beispiele\n");
      System.out.println("A = 10");
      System.out.println("B = 20");
      System.out.println("A == B : " + (A == B));                    // Is A equal to B?
      System.out.println("A != B : " + (A != B));                    // Is A not equal to B?
      System.out.println("A > B : " + (A > B));                      // Is A greater than B?
      System.out.println("A < B : " + (A < B));                      // Is A less than B?
      System.out.println("A >= B : " + (A >= B));                    // Is A greater or equal to B?
      System.out.println("A <= B : " + (A <= B));                    // Is A less or equal to B?
   }
}