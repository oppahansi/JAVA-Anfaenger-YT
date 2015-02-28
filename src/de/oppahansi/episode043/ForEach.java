/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode043;

public class ForEach {

  public static void main(String[] args) {
    /**
     * for-each loop - enhanced for-loop
     *
     * for (Datatype variable : array) {
     *    // statements
     * }
     */

    int[] testArray = {0, 5, 2, 8, 4, 1, 6, 7, 3, 9};

    for (int arrayValue : testArray) {
      System.out.println("arrayValue has the value -> " + arrayValue);
    }
  }
}