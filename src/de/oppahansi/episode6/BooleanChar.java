package de.oppahansi.episode6;

public class BooleanChar {

   public static void main(String[] args) {

      /*
       * boolean
       */
      boolean boolTrue = true;
      boolean boolFalse = false;

      System.out.println("boolTrue hat den Wert: " + boolTrue);
      System.out.println("boolFalse hat den Wert: " + boolFalse);

      /*
       * char
       */
      char charA = 'A';
      char charX = 'x';
      char charSmallest = '\u0000';
      char charTest = '\u407F';
      char charLargest = '\uFFFF';              // oder '\uffff'

      System.out.println("charA hat den Wert: " + charA);
      System.out.println("charX hat den Wert: " + charX);
      System.out.println("charSmallest hat den Wert: " + charSmallest);
      System.out.println("charTest hat den Wert: " + charTest);
      System.out.println("charLargest hat den Wert: " + charLargest);

   /*
    * Uebung 1:
    * Erstelle eine neue boolean Variable mit einem beliegen Namen und initialisiere
    * diese Variable mit dem Wert "true".
    * (Optional: Gebe diese Variable in der Konsole aus.)
    */

      boolean testBoolean = true;
      System.out.println("testBoolean hat den Wert: " + testBoolean);

   /*
    * Uebung 2:
    * Erstelle 2 neue char Variablen und initialisiere die Variablen mit beliebigen
    * Zeichen.
    * (Optional: Gebe diese Variablen in der Konsole aus.)
    */

      char initialeVorname = 'A';
      char initialeNachname = 'S';
      System.out.println("initialeVorname hat den Wert: " + initialeVorname);
      System.out.println("intialeNachname hat den Wert: " + initialeNachname);
   }
}
