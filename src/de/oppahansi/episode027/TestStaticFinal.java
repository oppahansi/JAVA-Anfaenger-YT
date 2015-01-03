package de.oppahansi.episode027;

public class TestStaticFinal {

   private final int TEST_PRIVATE_FINAL = 2;

   public static int COUNT_INSTANCES = 0;

   public static float TEST_STATIC_FINAL = 1.0f;

   public TestStaticFinal() {
      COUNT_INSTANCES++;
   }

   public static int calculate(int a, int b) {
      return a + b;
   }
}
