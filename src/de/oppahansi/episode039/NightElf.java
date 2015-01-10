/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode039;

public class NightElf extends Player {

   public NightElf(final String name) {
      super(name);
   }

   @Override
   public String getMovingAnimation() {
      return "Anmutig und elegant!";
   }
}