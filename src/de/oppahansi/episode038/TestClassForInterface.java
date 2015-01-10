package de.oppahansi.episode038;

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