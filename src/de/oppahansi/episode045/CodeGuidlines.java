/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode045;

public class CodeGuidlines {
  /**
   * Code Conventions for the Java Programming Language (official Java naming conventions)
   * -----------------------------------------------------------
   * FILE SUFFIXES
   *
   * File Type      | Suffix
   * -----------------------
   * Java source    | .java
   * Java bytecode  | .class
   *
   * Naming Conventions
   * -----------------------------------------------------------
   * PACKAGES / IMPORTS
   *
   * package de.oppahansi.episode45;
   * import de.oppahansi.episode44.Player;
   *
   * CLASS / INTERFACE / ENUM
   *
   * public class Test{...}
   * public interfac
   *
   * TestClass{...}
   *
   * VARIABLES
   *
   * int index;
   * int myAge;
   * String myNameIs;
   * static float PRICE;
   * final float CONSTANT = 4.2f;
   *
   * METHODS
   *
   * public void setMyAge(int myAge){...}
   * public int getMyAge(){...}
   * public void setBooleanValue(boolean booleanValue){...}
   * public boolean isBooleanValue(){...}                     // better prefix for boolean getter:
   *                                                          // is, has, would, should, contains, interacts, intersects, must
   *
   * public int mulitplyMyNumberBy(int factor){...}
   *
   * -----------------------------------------------------------

   ARRANGEMENT

   1. Always keep getters and setters together.

   2. Order class members as follows:
   A. Firstly the static fields:
   i.    public static final fields

   ii.   protected static final fields

   iii.  package private static final fields

   iv.   private static final fields

   v.    public static fields (non-final)

   vi.   protected static fields (non-final)

   vii.  package private static fields (non-final)

   viii. private static fields (non-final)

   B. Secondly the non-static fields:
   i.    public final fields (non-static)

   ii.   protected final fields (non-static)

   iii.  package private final fields (non-static)

   iv.   private final fields (non-static)

   v.    public fields (non-final, non-static)

   vi.   protected fields (non-final, non-static)

   vii.  package private fields (non-final, non-static)

   viii. private fields (non-final, non-static)

   C. constructors

   D. static methods

   E. instance methods (non-static)

   F. Inner enumerations, classes and interfaces:
   i.    inner enumerations

   ii.   inner interfaces

   iii.  static inner classes

   iv.   other inner classes (non-static)
   */
}