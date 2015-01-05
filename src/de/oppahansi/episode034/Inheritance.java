/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class Inheritance {

   public static void main(String[] args) {
      NightElfHunter nightElfHunter = new NightElfHunter("OppaHansi");

      System.out.println("nightElfHunter has the name : " + nightElfHunter.getName());
      System.out.println("nightElfHunter has the level : " + nightElfHunter.getLevel());
      System.out.println("nightElfHunter has the race bonus : " + nightElfHunter.getRaceBonus());
      System.out.println("nightElfHunter has the class bonus : " + nightElfHunter.getClassSkillBonus());
   }

   /**
    * Uebung 1:
    * Schau Dir den NightElfHunter an und versuch anhand dieses Beispiel einen HumanMage zu erstellen.
    * Erstelle dazu 2 weitere Klassen:
    * - Human
    * - HumanMage
    * Human soll wie NighElf von Player erben und einen Rassenbonus besitzen, denk Dir etwas aus, und einen Getter haben, der den
    * Zugriff erlaubt.
    * HumanMage soll von Human erben und einen Klassenbonus besitzen, dernk Dir etwas aus, und einen Getter haben, der den
    * Zugriff erlaubt.
    * Teste deine Klassen, wie hier oben, mit Konsolenausgaben.
    *
    * Eure Loesungen koennen gerne an mich geschickt werden oder besser noch
    * im Forum gepostet werden. Benutzt dazu entweder pastebin.com oder
    * die code Tags im Forum.
    */
}