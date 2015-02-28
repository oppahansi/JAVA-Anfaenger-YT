/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class Human extends Player {

  private String raceBonus;

  public Human(final String name) {
    super(name);
    raceBonus = "Wille -42";
  }

  public String getRaceBonus() {
    return raceBonus;
  }
}