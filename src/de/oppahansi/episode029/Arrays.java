/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode029;

public class Arrays {

  public static void main(String[] args) {
    /**
     * Array - Syntax (1 dimension)
     *
     * datatype variableName[];
     *
     * datatype[] variableName;
     * datatype[] variableName = new datatype[size];
     * datatype[] variableName = {datatypeValue, datatypeValue, ...};
     *
     * Example declaration:
     * int[] numbers;
     *
     * Example declaration + initialization
     * int[] numbers = new int[10];                       // Array filled with default values -> 0
     *
     * Example declaration + initialization #2
     * int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     *
     *
     * Array - Syntax (2 dimension)
     *
     * datatype variableName[][];
     *
     * datatype[][] variableName;
     * datatype[][] variableName = new datatype[size];
     * datatype[][] variableName = {
     *                              {datatypeValue, datatypeValue},
     *                              {datatypeValue, datatypeValue},
     *                              {...}
     *                              };
     */

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }

    int[] forLoopTest = new int[10];

    for (int i = 0; i < forLoopTest.length; i++) {
      forLoopTest[i] = i + 1;
    }

    System.out.println();
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(forLoopTest[i] + " ");
    }

    System.out.println();
    System.out.println();

    // int[][] twoDimensions = new int[10][10];
    int[][] twoDimensions = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
      {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
    };

    for (int i = 0; i < twoDimensions.length; i++) {
      for (int j = 0; j < twoDimensions[i].length; j++) {
        System.out.print(twoDimensions[i][j] + " ");
      }
      System.out.println();
    }

    /**
     * Uebung 1:
     * Erstelle ein byte Array der Laenge 5 (1 Dimension).
     * Erstelle ein String Array der Laenge 5 (1 Dimension).
     * Erstelle ein double Array mit der Laenge 5 und 10 (2 Dimensionen).
     * Initialisiere die Arrays wie oben auf 2 verschiedene Art und Weisen.
     *
     * Eure Loesungen koennen gerne an mich geschickt werden oder besser noch
     * im Forum gepostet werden. Benutzt dazu entweder pastebin.com oder
     * die code Tags im Forum.
     */
  }
}