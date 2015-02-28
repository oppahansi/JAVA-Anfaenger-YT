/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode009;

public class ConvertingTypeCasting {

  public static void main(String[] args) {
    /**
     Konventierung und Type-Casting mit primitiven Datentypen

     Konventierung, ohne Datenverlust

     byte -> short -> int -> long        (widening / upcasting)
     char  -> int
     float -> double


     Konventierung, mit Datenverlust

     long -> int -> short -> byte        (narrowing / downcasting)
     int -> char                 (nur außerhalb des gueltigen Bereichs)
     double -> float

     <<---------------------------------------------------------->>

     Type-Casting
     1. Variante:
     - widening / upcasting
     - zum teil automatisch

     2. Variante:
     - narrowing / downcasting
     - muss explizit "signalisiert" werden
     */

    //<<------------------------------------------------------------>>//

    byte byteConvertValue = 127;
    short shortTargetValue;
    int intTargetValue;
    long longTargetValue;

    // Konventierungsbeispiele - ohne Datenverlust
    System.out.println("Konventierungsbeispiele - ohne Datenverlust\n");

    System.out.println("(Startwert) Bytewert: " + byteConvertValue);

    shortTargetValue = byteConvertValue;                        // byte -> short
    System.out.println("Shortwert vom byte: " + shortTargetValue);

    intTargetValue = shortTargetValue;                          // short -> int
    System.out.println("Intwert vom short: " + intTargetValue);

    longTargetValue = intTargetValue;                           // int -> long
    System.out.println("Longwert vom int: " + longTargetValue + "\n");

    char charConvertValue = 'X';

    intTargetValue = charConvertValue;                          // char -> int
    System.out.println("Intwert vom char: " + intTargetValue + "\n");

    float floatConvertValue = 3.4028235E38F;
    double doubleTargetValue;

    doubleTargetValue = floatConvertValue;                      // float -> double
    System.out.println("Doublewert vom float: " + doubleTargetValue + "\n");

    //<<------------------------------------------------------------>>//

    // Konventierungsbeispiele - mit Datenverlust
    System.out.println("Konventierungsbeispiele - mit Datenverlust\n");

    long longConvertValue = 123456789012L;
    byte byteTargetValue;

    System.out.println("(Startwert) Longwert: " + longConvertValue);

    shortTargetValue = (short) longConvertValue;                    // long -> int
    System.out.println("Shortwert vom long: " + shortTargetValue);

    shortTargetValue = (short) intTargetValue;                  // int -> short
    System.out.println("Shortwert vom int: " + shortTargetValue);

    byteTargetValue = (byte) shortTargetValue;                  // short -> byte
    System.out.println("Bytewert vom short: " + byteTargetValue + "\n");

    int intConvertValue = 87;
    char charTargetValue;

    charTargetValue = (char) intConvertValue;                    // int -> char (nur im gueltigen Bereich sinnvoll)
    System.out.println("Charwert vom int: " + charTargetValue + "\n");

    double doubleConvertValue = 1.7976931348623157E308D;
    float floatTargetValue;

    floatTargetValue = (float) doubleConvertValue;              // double -> float
    System.out.println("Floatwert vom double: " + floatTargetValue);

    //<<------------------------------------------------------------>>//

    /**
     * Uebung 1:
     * Vertausche die Reihenfolge von den Konventierungen beim upcasting, z.B.:
     * byte -> int / short -> long
     * und schaue was dann passiert!
     */

    /**
     * Uebung 2:
     * Vertausche die Reihenfolge von den Konventierungen beim downcasting, z.B.:
     * long -> short / int -> byte
     * und schaue was dann passiert!
     */
  }
}