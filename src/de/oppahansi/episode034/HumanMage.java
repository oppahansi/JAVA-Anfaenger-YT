/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class HumanMage extends Human {

  private String classBonus;

  public HumanMage(final String name) {
    super(name);
    classBonus = "Intelligenz +42";
  }

  public String getClassBonus() {
    return classBonus;
  }
}
