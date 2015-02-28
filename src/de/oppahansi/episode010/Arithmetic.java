/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode010;

public class Arithmetic {

  public static void main(String[] args) {
    /**
     * Arithmetic Operators:
     *
     * + , - , * , / , % , ++ , --
     */

    int A = 25;
    int B = 20;

    System.out.println("Arithmetic Operators - Beispiele\n");
    System.out.println("A = 10");
    System.out.println("B = 20");
    System.out.println("A + B = " + (A + B));                      // Addition
    System.out.println("A - B = " + (A - B));                      // Subtraction
    System.out.println("A * B = " + (A * B));                      // Multiplication
    System.out.println("B / A = " + (B / A));                      // Division
    System.out.println("A % B = " + (A % B));                      // Modulus
    A++;
    System.out.println("A nach Inkrementierung: " + A);            // Increment
    B--;
    System.out.println("B nach Dekrementierung: " + B);            // Decrement
  }
}