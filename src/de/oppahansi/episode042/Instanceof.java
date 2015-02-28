/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode042;

public class Instanceof {

  public static void main(String[] args) {
    GameWorld gameWorld = new GameWorld();

    GameObject player = new Player();
    GameObject npc = new Npc();
    GameObject animal = new Animal();

    System.out.println("player instanceof GameObject  -->  " + (player instanceof GameObject));
    System.out.println("player instanceof GameObjectImpl  -->  " + (player instanceof GameObjectImpl));
    System.out.println("player instanceof Player  -->  " + (player instanceof Player));
    System.out.println();
    System.out.println("npc instanceof Player  -->  " + (npc instanceof Player));
    System.out.println("animal instanceof Player  -->  " + (animal instanceof Player));
    System.out.println();
    gameWorld.activateEvent(player);
  }
}