package de.oppahansi.episode8;

public class FloatDouble {

   public static void main(String[] args) {

      /*
        float
        - 32-bit single-precision IEEE 754 floating point
       */

      float floatMinValue = Float.MIN_VALUE;
      float floatMaxValue = Float.MAX_VALUE;
      float testFloatKomma = 1.0F;

      System.out.println("floatMinValue hat den Wert: " + floatMinValue);
      System.out.println("floatMaxValue hat den Wert: " + floatMaxValue);


      /*
        double
        - 64-bit double-precision IEEE 754 floating point
       */

      double doubleMinValue = Double.MIN_VALUE;
      double doubleMaxValue = Double.MAX_VALUE;
      double testDoubleKomma = 1.0;

      System.out.println("doubleMinValue hat den Wert: " + doubleMinValue);
      System.out.println("doubleMaxValue hat den Wert: " + doubleMaxValue);

      /*
       * Uebung 1:
       * Erstelle von den o.g. Datentypen jeweils eine neue Variable, initialisiere
       * die Variablen mit entsprechenden Werten und gib diese in der Konsole aus.
       */

      /*
       * Uebung 2:
       * Kann man bei den float-Variablen z.B. bei der testFloatKomma-Variable
       * das f bei 1.0f weglassen? (Erkläre es)
       */
   }
}