/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode040;

public abstract class Player {

  private String name;
  private Weapon weapon;

  public Player(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  public String getName() {
    return name;
  }

  public String getWeaponType() {
    return weapon.getType();
  }

  public int getWeaponDamage() {
    return weapon.getDamage();
  }

  public abstract String getMovingAnimation();

}