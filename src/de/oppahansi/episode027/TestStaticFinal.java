/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode027;

public class TestStaticFinal {

  public static int COUNT_INSTANCES = 0;
  public static float TEST_STATIC_FINAL = 1.0f;
  private final int TEST_PRIVATE_FINAL = 2;

  public TestStaticFinal() {
    COUNT_INSTANCES++;
  }

  public static int calculate(int a, int b) {
    return a + b;
  }
}
