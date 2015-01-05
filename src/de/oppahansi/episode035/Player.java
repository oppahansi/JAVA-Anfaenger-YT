/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode035;

public abstract class Player {

   protected int level;
   protected String name;

   public Player(String name) {
      level = 1;
      this.name = name;
   }

   abstract void setLevel(int level);

   abstract int getLevel();

   abstract void setName(String name);

   abstract String getName();
}