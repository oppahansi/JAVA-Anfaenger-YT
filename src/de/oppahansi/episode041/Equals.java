/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode041;

public class Equals {
   public static void main(String[] args) {

      String first = "TEST_STRING";
      String second = "TEST";
      String third = "TEST_STRING";
      String forth = new String("TEST");

      System.out.println("first == second  ->  " + (first == second));
      System.out.println("first == third  ->  " + (first == third));
      System.out.println();
      System.out.println("first.equals(second)  ->  " + (first.equals(second)));
      System.out.println("first.equals(third)  ->  " + (first.equals(third)));
      System.out.println();
      System.out.println("second == forth  ->  " + (second == forth));
      System.out.println("second.equals(forth)  ->  " + (second.equals(forth)));
   }
}