/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode040;

public class Polymorphism {

  public static void main(String[] args) {
    Player[] players = new Player[3];

    players[0] = new NightElf("Nachtelf");
    players[1] = new Human("Mensch");
    players[2] = new Gnome("Gnom");

    System.out.println("Nachelft bewegt sich: " + players[0].getMovingAnimation());
    System.out.println("Mensch bewegt sich: " + players[1].getMovingAnimation());
    System.out.println("Gnom bewegt sich: " + players[2].getMovingAnimation());

    System.out.println("Nachelft hat \"" + players[0].getWeaponType() + "\" als Waffe.");
    System.out.println("Mensch macht " + players[1].getWeaponDamage() + " Schaden mit seiner Waffe.");
    System.out.println("Gnom hat \"" + players[2].getWeaponType() + "\" als Waffe.");
  }
}