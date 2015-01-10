/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode039;

public class Gnome  extends Player {

   public Gnome(final String name) {
      super(name);
   }

   @Override
    public String getMovingAnimation() {
      return "Eigenartig und lustig!";
   }
}