/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode026;

public class TestModifier {

  public String testPublic = "(public) -> can be seen in the whole project";

  String testPackageModifier = "(no modifier) -> can be seen package wide";

  private String testPrivate = "(private) -> can be seen within the class only and needs a method to provide access";

  public String getTestPrivate() {
    return testPrivate;
  }
}
