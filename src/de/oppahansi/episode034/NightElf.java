/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class NightElf extends Player {

   private String raceBonus;

   public NightElf(String name) {
      super(name);
      raceBonus = "Nature resistance +25";
   }

   public String getRaceBonus() {
      return raceBonus;
   }
}