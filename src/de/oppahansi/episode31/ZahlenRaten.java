/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode31;

import java.util.Random;
import java.util.Scanner;

/**
 * Lustiges Zahlenraten
 * ---------------------
 * Erraten Sie die Zufahlszahl in moeglichst wenigen Schritten!
 * Die Zahl kann zwischen 1 und 100 liegen
 *
 * Bitte eine Zahl eingeben:                                            // hier wird auf die Usereingabe gewartet
 * 50                                                                   // hier hat der User die 50 eingegeben
 *
 * Die gesuchte Zahl ist kleiner!                                       // Feedback, ob die gesuchte Zahl kleiner oder groesser ist
 *
 * Bitte eine Zahl eingeben:                                            // N�chster Versuch etc...
 * 25
 *
 * Die gesuchte Zahl ist groesser!
 *
 * Bitte eine Zahl eingeben:
 *
 * ...
 * ...
 *
 * 41
 *
 * Sie haben die gesuchte Zahl gefunden!                          // Gesuchte Zahl gefunden
 * Sie haben die 41 in 7 Versuchen gefunden.                      // Gesuchte Zahl ausgeben und die Anzahl an Versuchen anzeigen
 *
 * (Weiter spielen? (j = Ja. | n = Nein.)                         // (Optional: Implementierung der Abfrage f�r ein Neues Spiel))
 *
 *
 * ---------------------------------------------------------------------------------------------------------------
 *
 * Eine Zufallszahl erstellt man mit:
 *
 * Random zufall = new Random();
 * zufallZahl = 0 + zufall.nextInt(100 - 0 + 1);        // 0 ist die Untergrenze , 100 ist die Obergrenze
 * man kann es auch so schreiben:
 * zufallsZahl = untergrenze + zufall.nextInt(obergrenze - untergrenze + korrektur);
 *
 * Usereingaben entgegen nehmen mit:
 *
 * Scanner input = new Scanner(System.in);
 *
 * input.nextInt();                        // int einlesen
 * input.next();                           // String einlesen
 *
 * Letzter Tipp:
 * while-Schleifen benutzen :)
 *
 */

public class ZahlenRaten {

   /**
    * Hier das Minispiel implementieren.
    */
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random zufall = new Random();

      boolean aktiv = true;

      while (aktiv) {
         System.out.println("Lustiges Zahlenraten");
         System.out.println("------------------------------");
         System.out.println("Erraten Sie die Zufallszahl in moeglichst wenigen Schritten!");
         System.out.println("Die Zufallszahl liegt 1 und 100");

         int zufallsZahl = zufall.nextInt(100 + 1);
         int eingabe = 0;
         int versuche = 1;

         while (true) {
            System.out.println("Bitte geben Sie eine Zahl ein: ");
            eingabe = input.nextInt();

            if(eingabe <= 0 || eingabe > 100) {
               System.out.println("Ungueltige Eingabe! Eingabe bitte wiederholen!");
            } else if (eingabe < zufallsZahl) {
               System.out.println("Die gesuchte Zahl ist groesser!");
               versuche++;
            } else if(eingabe > zufallsZahl) {
               System.out.println("Die gesuchte Zahl ist kleiner!");
               versuche++;
            } else {
               System.out.println("Sie haben die gesuchte Zahl gefunden!");
               System.out.println("Die Zufallszahl " + zufallsZahl + " wurde in " + versuche + " Veruschen gefunden!");
               break;
            }
         }

         System.out.println("Noch einmal spielen? (1 = Ja. | 2 = Nein.)");
         eingabe = input.nextInt();

         if(eingabe == 2) {
            aktiv = false;
         }
      }
   }
}