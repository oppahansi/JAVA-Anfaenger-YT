package de.oppahansi.episode37;

public class Interfaces {
   public static void main(String[] args) {
      /**
       * interface - Syntax
       *
       * modifier interface InterfaceName {
       *    (modifier) static datatype VARIABLE_NAME;
       *    (modifier) final datatype VARIABLE_NAME = value;
       *
       *    (modifier) datatype methodName();
       *    (modifier) datatype methodName(parameterDatatype variableName);
       * }
       *
       * - No constructor
       * - Similar to abstract classes
       * - keyword implements
       * - OneInterface can extend a SecondInterface
       */

      TestClassForInterface testUsage = new TestClassForInterface();

      System.out.println("Using the method declared in the interface and implemented in the class: ");
      testUsage.printString();

      System.out.println("\nContains isExtended() method? : " + testUsage.isExtended());
   }
}