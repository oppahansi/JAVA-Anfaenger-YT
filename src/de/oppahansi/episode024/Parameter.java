/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode024;

public class Parameter {

   public static void main(String[] args) {
      System.out.println("Test parameter\n");
      testParameter(42);
      System.out.println();
      testMultipleParameters("Test", 1337);
   }

   private static void testParameter(int test) {
      System.out.println("Method execution " + test);
   }

   private static void testMultipleParameters(String name, int age) {
      System.out.println("Name is: " + name + " and age is " + age);
   }
}