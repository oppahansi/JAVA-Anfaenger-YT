/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode030;

import java.util.Scanner;

public class InputOutput {

   public static void main(String[] args) {

      System.out.print("No line break");
      System.out.println("With line break");

      Scanner input = new Scanner(System.in);

      System.out.println("Read next int: ");
      int testIntInput = input.nextInt();

      System.out.println("testIntInput has the value: " + testIntInput);

      System.out.println("Read String: ");
      String testStringInput = input.next(); // input.nextLine();

      System.out.println("testStringInput has the value: " + testStringInput);
   }
}