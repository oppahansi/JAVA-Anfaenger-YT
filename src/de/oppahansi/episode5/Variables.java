package de.oppahansi.episode5;

public class Variables {
   public static void main(String[] args){

      /**
       * Syntax - Variablen:
       *
       * Datentyp variablenName;                         (Deklaration)
       * variablenName = entsprechenderWert;             (Initialisierung)
       *
       * oder
       *
       * Datentyp variablenName = entsprechenderWert;    (Deklaration + Initialisierung)
       */

      byte byteVariable;                                 // (Deklaration)
      byteVariable = 127;                                // (Initialisierung)

      short shortVariable = 32000;                       // (Deklaration + Initialisierung)

      int intVariable;

      long longVariable;
      longVariable = 1000000000000L;
      // longVariable = 1000000000000;                   // Funktioniert's ohne L?

      intVariable = 1000000;                             // Initialisierung zum späteren Zeitpunkt

      // Ausgabe der Variablenwerte
      System.out.println("Unsere byte Variable hat den Wert: " + byteVariable);
      System.out.println("Unsere short Variable hat den Wert: " + shortVariable);
      System.out.println("Unsere int Variable hat den Wert: " + intVariable);
      System.out.println("Unsere long Variable hat den Wert: " + longVariable);


      /**
       * Uebung 1:
       * Was passiert, wenn man die Zeile 28 auskommentiert und die Variable
       * "intVariable" dadurch nicht initialisiert?
       *
       * Uebung 2:
       * Was passiert, wen man in der Zeile 18 die Variable "byteVariable" mit
       * einem Wert ueber 127 initialisiert?
       *
       * Uebung 3:
       * Was passiert, wenn man die Zeile 24 auskommentiert?
       *
       * Uebung 4:
       * Beantworte die Frage in der Zeile 26.
       */
   }
}