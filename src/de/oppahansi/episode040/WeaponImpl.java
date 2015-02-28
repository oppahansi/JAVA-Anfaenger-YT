/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode040;

public abstract class WeaponImpl implements Weapon {

  private int damage;
  private String type;

  public WeaponImpl(String type, int damage) {
    this.type = type;
    this.damage = damage;
  }

  @Override
  public int getDamage() {
    return damage;
  }

  @Override
  public String getType() {
    return type;
  }
}
