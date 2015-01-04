/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode032;

public class EscapeSequences {
   public static void main(String[] args) {
      /**
       * Escapesequences:
       \t	Insert a tab in the text at this point.
       \b	Insert a backspace in the text at this point.
       \n	Insert a newline in the text at this point.
       \r	Insert a carriage return in the text at this point.
       \f	Insert a formfeed in the text at this point.
       \'	Insert a single quote character in the text at this point.
       \"	Insert a double quote character in the text at this point.
       \\	Insert a backslash character in the text at this point.
       */

      System.out.println("Backspace      : " + "ABCDE\bFGHIJ");
      System.out.println("Formfeed       : " + "ABCDE\fFGHIJ");
      System.out.println("Linefeed       : " + "ABCDE\nFGHIJ");
      System.out.println("Single Quote   : " + "ABCDE\'FGHIJ");
      System.out.println("Double Quote   : " + "ABCDE\"FGHIJ");
      System.out.println("Backslash      : " + "ABCDE\\FGHIJ");
      System.out.println("Horizontal Tab : " + "ABCDE\t\tFGHIJ");
      System.out.println("Carriage Return: " + "ABCDE\rFGHIJ");


      /** Expected output
       Backspace      : ABCDFGHIJ
       Formfeed       : ABCDE
       FGHIJ
       Linefeed       : ABCDE
       FGHIJ
       Single Quote   : ABCDE'FGHIJ
       Double Quote   : ABCDE"FGHIJ
       Backslash      : ABCDE\FGHIJ
       Horizontal Tab : ABCDE	FGHIJ
       FGHIJage Return: ABCDE
       */

      for (int i = 0; i < 100; i++) {
         System.out.print("Progress: " + i + " %\r");
         try {
            Thread.sleep(500);
         }
         catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}