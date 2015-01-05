/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class Player {

   private int level;
   private String name;

   public Player(String name) {
      level = 1;
      this.name = name;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public int getLevel() {
      return level;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }
}