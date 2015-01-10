/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode039;

public class Human extends Player {

   public Human(final String name) {
      super(name);
   }

   @Override
   public String getMovingAnimation() {
      return "Normal und unauffällig!";
   }
}