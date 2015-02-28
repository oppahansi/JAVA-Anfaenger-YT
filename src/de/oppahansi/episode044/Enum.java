/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode044;

public class Enum {

  public static void main(String[] args) {
    for (EnumClass value : EnumClass.values()) {
      System.out.println(value + " has the ordinal : " + value.ordinal());
    }

    System.out.println(EnumClass.VALUE_ONE.getIntValue());
    System.out.println(EnumClass.VALUE_TWO.getStringValue());

    System.out.println();

    Player player = new Player("TestPlayer", Gender.FEMALE);
    System.out.println(player.getName() + " has the gender : " + player.getGender());
  }
}
