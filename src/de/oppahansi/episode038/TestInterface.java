/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode038;

public interface TestInterface extends TestInterfaceToExtend {

  String testString = "testString defined in interface";

  final int constantVariable = 42;

  void printString();

}