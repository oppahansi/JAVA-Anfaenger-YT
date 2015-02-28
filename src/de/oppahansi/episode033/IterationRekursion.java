/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode033;

public class IterationRekursion {

  public static void main(String[] args) {

    System.out.println("recursive -> 5! : " + calculateFacultyRecursive(5));
    System.out.println("iterative -> 5! : " + calculateFacultyIterative(5));

  }

  private static int calculateFacultyRecursive(int faculty) {
    if (faculty == 1) {
      //System.out.println(faculty);
      return 1;
    }
    else {
      //System.out.println(faculty);
      return faculty * calculateFacultyRecursive(faculty - 1);
    }

    /**
     1. Aufruf mit 5:        5 * calculateFacultyRecursive(5-1)
     2. Aufruf mit 4:        5 * 4 * calculateFacultyRecursive(4-1)
     3. Aufruf mit 3:        5 * 4 * 3 * calculateFacultyRecursive(3-1)
     4. Aufruf mit 2:        5 * 4 * 3 * 2 * calculateFacultyRecursive(2-1)
     5. Aufruf mit 1:        5 * 4 * 3 * 2 * 1
     */
  }

  private static int calculateFacultyIterative(int faculty) {
    int result = 1;

    for (int i = 2; i <= faculty; i++) {
      result *= i;
    }

    return result;
  }
}
