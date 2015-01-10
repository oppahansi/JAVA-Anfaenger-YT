/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode039;

public class Polymorphism {

   public static void main(String[] args) {
      Player[] players = new Player[3];

      players[0] = new NightElf("Nachtelf");
      players[1] = new Human("Mensch");
      players[2] = new Gnome("Gnom");

      System.out.println("Nachelft bewegt sich: " + players[0].getMovingAnimation());
      System.out.println("Mensch bewegt sich: " + players[1].getMovingAnimation());
      System.out.println("Gnom bewegt sich: " + players[2].getMovingAnimation());

   }
}