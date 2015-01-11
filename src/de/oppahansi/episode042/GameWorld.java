/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode042;

public class GameWorld {

   public void activateEvent(final GameObject gameObject) {
      if (gameObject instanceof Player) {
         System.out.println("Player recognized  -->  Event triggered!");
      }
      else {
         System.out.println("gameObject is not a player - event will not be triggered!");
      }
   }
}