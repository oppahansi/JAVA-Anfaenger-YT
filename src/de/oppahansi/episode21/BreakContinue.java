/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode21;

public class BreakContinue {

   public static void main(String[] args) {
      /**
       * Keywords break, continue - Loop control / jumps
       */

      // break  ->  end the loop immediately
      for (int i = 0; i < 10; i++) {
         if(i == 5) {
            break;
         }
         System.out.println("(for) break in " + (5 - i) + "...");
      }

      System.out.println();

      int counter = 0;
      while(true) {
         if(counter == 5) {
            break;
         }
         System.out.println("(while) break in " + (5 - counter) + "...");
         counter++;
      }

      System.out.println();

      // continue  ->  end current iteration -> go to loop condition / start next iteration
      for (int i = 0; i < 10; i++) {
         if(i == 5) {
            System.out.println("i = " + i);
            continue;
         }
         System.out.println("i is not 5 but is " + i);
      }

      counter = 0;
      while (counter < 10) {
         if(counter == 5) {
            System.out.println("i = " + counter);
            continue;
         }
         System.out.println("i is not 5 but is " + counter);
         counter++;
      }
   }

}
