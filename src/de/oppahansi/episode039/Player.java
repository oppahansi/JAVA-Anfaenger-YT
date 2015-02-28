/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode039;

public abstract class Player {

  private String name;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String getMovingAnimation();
}