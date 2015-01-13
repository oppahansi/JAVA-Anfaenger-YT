/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode044;

public class Player {

   private int level;
   private String name;
   private Gender gender;

   public Player(String name, Gender gender) {
      level = 1;
      this.name = name;
      this.gender = gender;
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

   public Gender getGender() {
      return gender;
   }
}