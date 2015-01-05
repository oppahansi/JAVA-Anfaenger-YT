/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode035;

public class NightElf extends Player {

   private String raceBonus;

   public NightElf(String name) {
      super(name);
      raceBonus = "Nature resistance +25";
   }

   @Override
   public void setLevel(final int level) {
      super.level = level;
   }

   @Override
   public int getLevel() {
      return super.level;
   }

   @Override
   public void setName(final String name) {
      super.name = name;
   }

   @Override
   public String getName() {
      return super.name;
   }

   public String getRaceBonus() {
      return raceBonus;
   }
}