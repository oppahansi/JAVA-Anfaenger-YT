/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode044;

public enum EnumClass {
   VALUE_ONE(42),
   VALUE_TWO("Second"),
   VALUE_THREE;

   private int intValue;
   private String stringValue;

   private EnumClass() {

   }

   private EnumClass(int intValue) {
      this.intValue = intValue;
   }

   private EnumClass(String stringValue) {
      this.stringValue = stringValue;
   }

   public int getIntValue() {
      return intValue;
   }

   public String getStringValue() {
      return stringValue;
   }
}