/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode030;

/**
 * Lustiges Zahlenraten
 * ---------------------
 * Erraten Sie die Zufahlszahl in moeglichst wenigen Schritten!
 * Die Zahl kann zwischen 1 und 100 liegen
 * <p>
 * Bitte eine Zahl eingeben:                                            // hier wird auf die Usereingabe gewartet
 * 50                                                                                           // hier hat der User die 50 eingegeben
 * <p>
 * Die gesuchte Zahl ist kleiner!                                       // Feedback, ob die gesuchte Zahl kleiner oder groesser ist
 * <p>
 * Bitte eine Zahl eingeben:                                            // N�chster Versuch etc...
 * 25
 * <p>
 * Die gesuchte Zahl ist groesser!
 * <p>
 * Bitte eine Zahl eingeben:
 * <p>
 * ...
 * ...
 * <p>
 * 41
 * <p>
 * Sie haben die gesuchte Zahl gefunden!                        // Gesuchte Zahl gefunden
 * Sie haben die 41 in 7 Versuchen gefunden.            // Gesuchte Zahl ausgeben und die Anzahl an Versuchen anzeigen
 * <p>
 * (Weiter spielen? (j = Ja. | n = Nein.)                       // (Optional: Implementierung der Abfrage f�r ein Neues Spiel))
 * <p>
 * <p>
 * ---------------------------------------------------------------------------------------------------------------
 * <p>
 * Eine Zufallszahl erstellt man mit:
 * <p>
 * Random zufall = new Random();
 * zufallZahl = 0 + zufall.nextInt(100 - 0 + 1);        // 0 ist die Untergrenze , 100 ist die Obergrenze
 * man kann es auch so schreiben:
 * zufallsZahl = untergrenze + zufall.nextInt(obergrenze - untergrenze + korrektur);
 * <p>
 * Usereingaben entgegen nehmen mit:
 * <p>
 * Scanner s = new Scanner(System.in);
 * <p>
 * s.nextInt(); // int einlesen
 * s.next();            // String einlesen
 * <p>
 * Letzter Tipp:
 * while-Schleifen benutzen :)
 */

public class ZahlenRaten {

  /**
   * Hier das Minispiel implementieren.
   */
  public static void main(String[] args) {

  }

}
