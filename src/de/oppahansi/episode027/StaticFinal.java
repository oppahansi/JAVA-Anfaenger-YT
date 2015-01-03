/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode027;

public class StaticFinal {
   public static void main(String[] args) {

      System.out.println("static variable with value : " + TestStaticFinal.TEST_STATIC_FINAL);
      System.out.println("Use static method to calculate a(5) + b(3): " + TestStaticFinal.calculate(5, 3));

      TestStaticFinal testStaticFinal1 = new TestStaticFinal();
      TestStaticFinal testStaticFinal2 = new TestStaticFinal();

      System.out.println("Instance counter has the value: " + TestStaticFinal.COUNT_INSTANCES);

   }
}
