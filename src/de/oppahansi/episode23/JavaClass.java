/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode23; // de/oppahansi/episode23 - relativ zum src-Ordner

/**
 simplest JAVA class

 class ClassName {

 }
 */

/**
 JAVA Class - Syntax

 modifier keyword ClassName {
   modifier datatype variableName;
   modifier datatype variableName = defaultValue;

   // default Constructor
   modifier ClassName() {

   }

   // modified Constructor
   modifier ClassName(parameterDatatype variableName) {
      // Statements
   }

   modifier datatype methodName() {
      // Statements
   }

   modifier datatype methodName(parameterDatatype variableName) {
      // Statements
    }
 }
 */

public class JavaClass {

   // Attributes / Variables
   public int intValue = 10;
   public long longValue;

   String stringValue;

   //(default) Constructor
   public JavaClass() {

   }

   // modified Constructor
   public JavaClass(String stringValue) {
      longValue = 100000000000L;
      this.stringValue = stringValue;
   }

   // Methods - Getter / Setter - Special Methods
   public void setIntValue(int intValue) {
      this.intValue = intValue;
   }

   public int getIntValue() {
      return intValue;
   }

   public void setStringValue(String stringValue) {
      this.stringValue = stringValue;
   }

   public String getStringValue() {
      return stringValue;
   }

   private void methodName() {
      // Do stuff without returning anything
   }

   //<<----------------------------------------------->>//

   // Demo - inner class
   static class InnerClass {
      private int testIntValue = 42;

      public InnerClass() {

      }

      public int getTestIntValue() {
         return testIntValue;
      }
   }

   // Demo - private class
   private static class PrivateClass {
      private String testString = "In a private class!";

      public String getTestString() {
         return testString;
      }
   }
}