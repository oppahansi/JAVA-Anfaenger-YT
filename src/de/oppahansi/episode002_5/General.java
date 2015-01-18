/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode002_5;

public class General {
   /**
    * General Informations to Usages
    *
    * public class JavaClass {...}                    <-- Java classes
    *
    * public static void main(String[] args) {...}    <-- Starting point in Java Applications
    *
    * System.out.print();                             <-- Used for console outputs - no line break after each line
    * System.out.println();                           <-- Used for console outputs - with line breaks after each line
    * [ , ] , { , } , ; , . , ,
    */

   public static void main(String[] args) {
      System.out.print("First");
      System.out.print("Second");
      System.out.println();
      System.out.println("Console output here");
      System.out.println("Some output " + "and added part.");
   }
}