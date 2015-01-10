package de.oppahansi.episode037;

public class TestClassForInterface implements TestInterface {

   @Override
   public void printString() {
      System.out.println(testString);
   }

   @Override
   public boolean isExtended() {
      return true;
   }
}