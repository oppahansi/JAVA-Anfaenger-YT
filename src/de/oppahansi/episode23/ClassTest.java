/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode23;

public class ClassTest {

   public static void main(String[] args) {
      JavaClass testObjectDefault = new JavaClass();
      JavaClass testObjectParameter = new JavaClass("TESTPARAMETER");

      System.out.println("Object with default constructor - > " + testObjectDefault.stringValue);
      System.out.println("Object constructor using parameters -> " + testObjectParameter.stringValue);

      System.out.println();

      System.out.println("Use getter instead: testObjectDefault.getStringValue() -> " + testObjectDefault.getStringValue());
      System.out.println("Use getter instead: testObjectParameter.getStringValue() -> " + testObjectParameter.getStringValue());

      //<<------------------------------------------------------------------------------------------------------------------------>>//

      JavaClass.InnerClass innerClass = new JavaClass.InnerClass();
      //JavaClass.PrivateClass privateClass = new JavaClass.PrivateClass();

      System.out.println();
      System.out.println("Innverclass can be accessed!");
      System.out.println("get the int value from innverClass: " + innerClass.getTestIntValue());

   }

   /**
    * Uebung 1:
    * Erstelle eine neue JAVA-Klasse. Ohne main-Methode.
    * Die Klasse soll Dich repraesentieren
    * (waehle den Namen der Klasse selbst) und
    * Attribute(Variablen) haben, die folgende Werte enthalten:
    * - Deinen Namen (String)
    * - Dein Alter (int)
    * - Deine groesse (int)
    * - Haarfarbe oder Augenfarbe oder Hautfarbe oder Herkunft oder Geburtsort
    * Wie viele Attribute Ihr definiert ist euch überlassen.
    *
    * Die Klasse soll 2 Konstruktoren haben:
    * - Standartkonstruktor mit "Standartwerten"
    * - modifizierten / erweiterten Konstruktor, der die übergebenen Werte entsprechend
    *   setzt
    *
    * Die Klass soll Methoden haben, vorerst nur getter und setter
    * für die angegebenen Attribute.
    *
    * Eure Loesungen koennen gerne an mich geschickt werden oder besser noch
    * im Forum gepostet werden. Benutzt dazu entweder pastebin.com oder
    * die code Tags im Forum.
    */

   /**
    * Uebung 2:
    * Erstelle eine neue JAVA-Klasse. Mit einer main-Methode.
    * Die Klasse soll deine Klasse aus Uebung 1 testen.
    * Waehle den Klassennamen selbst.
    * Siehe oben wie man andere Klassen benutzen kann
    * und probiere einfach selbst herauszufinden, wie weit Du kommst.
    * Gebe einige Attribute aus der Klasse, die Dich repraesentiert, in der Konsole aus.
    *
    * Eure Loesungen koennen gerne an mich geschickt werden oder besser noch
    * im Forum gepostet werden. Benutzt dazu entweder pastebin.com oder
    * die code Tags im Forum.
    */
}