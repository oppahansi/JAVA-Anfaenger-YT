package de.oppahansi.episode7;

public class ByteShortIntLong {

   public static void main(String[] args) {

      /**
        byte
         - 8-bit Zweierkomplement Integerwert -> 1 Byte im RAM
         - Wertebereich von -128 bis 127
         - kann genutz werden um z.B. Speicherplatz in großen
           Arrays zu sparen oder einfach für kleine Werte
           verwendet werden
       */

      byte byteMinValue = -128;           // Byte.MIN_VALUE
      byte byteMaxValue = 127;            // Byte.MAX_VALUE

      System.out.println("byteMinValue hat den Wert: " + byteMinValue);
      System.out.println("byteMaxValue hat den Wert: " + byteMaxValue);


      /**
        short
         - 16-bit Zweierkomplement Integerwert -> 2 Byte im Ram
         - Wertebereich von -32,768 bis 32,767
         - analog zu byte -> Speicherplatz sparen
       */

      short shortMinValue = -32768;       // Short.MIN_VALUE
      short shortMaxValue = 32767;        // Short.MAX_VALUE

      System.out.println("shortMinValue hat den Wert: " + shortMinValue);
      System.out.println("shortMaxValue hat den Wert: " + shortMaxValue);


      /**
        int
         - 32-bit Zweierkomplement Integerwert - 4 Byte im Ram
         - Wertebereich von -2^31 bis 2^31 - 1
         - Beispiel: YouTubeViews-Zähler (Gangnam Style-Video)
       */

      int intMinValue = -2147483648;      // Integer.MIN_VALUE
      int intMaxValue = 2147483647;       // Integer.MAX_VALUE

      System.out.println("intMinValue hat den Wert: " + intMinValue);
      System.out.println("intMaxValue hat den Wert: " + intMaxValue);


      /**
        long
         - 64-bit Zweierkomplement Integerwert - 8 Byte im Ram
         - Wertebereich von -2^63 bis 2^63 - 1
       */

      long longMinValue = Long.MIN_VALUE;
      long longMaxValue = Long.MAX_VALUE;

      System.out.println("longMinValue hat den Wert: " + longMinValue);
      System.out.println("longMaxValue hat den Wert: " + longMaxValue);


      /**
       * Uebung 1:
       * Erstelle von jedem hier genannten Datentyp eine neue Variable,
       * initialiesere diese Variable mit entsprechnenden Werten
       * und gib die Variablen in der Konsole aus.
       */

      /**
       * Uebung 2:
       *  - Kann man short in einen long konventieren? (Erklaere es)
       *  - Kann man int in einen byte konventieren? (Erklaere es)
       *  - Verschaffe Dir einen Gesamtueberblick ueber die
       *    Konventierungsmoeglichkeiten.
       */
   }
}