/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode023; // de/oppahansi/episode023 - relativ zum src-Ordner

/**
 simplest JAVA class

 class ClassName {

 }
 */

/**
 * JAVA Class - Syntax
 * <p>
 * modifier keyword ClassName {
 * modifier datatype variableName;
 * modifier datatype variableName = defaultValue;
 * <p>
 * // default Constructor
 * modifier ClassName() {
 * <p>
 * }
 * <p>
 * // modified Constructor
 * modifier ClassName(parameterDatatype variableName) {
 * // Statements
 * }
 * <p>
 * modifier datatype methodName() {
 * // Statements
 * }
 * <p>
 * modifier datatype methodName(parameterDatatype variableName) {
 * // Statements
 * }
 * }
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

  public int getIntValue() {
    return intValue;
  }

  // Methods - Getter / Setter - Special Methods
  public void setIntValue(int intValue) {
    this.intValue = intValue;
  }

  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
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