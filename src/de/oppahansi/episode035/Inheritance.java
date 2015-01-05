package de.oppahansi.episode035;

public class Inheritance {

   public static void main(String[] args) {
      NightElfHunter nightElfHunter = new NightElfHunter("OppaHansi");

      System.out.println("nightElfHunter allows now direct access to attributes!");
      System.out.println("name : " + nightElfHunter.name);
      System.out.println("level : " + nightElfHunter.level);
      nightElfHunter.level = 100;
      System.out.println("level after modifing: " + nightElfHunter.level);
      nightElfHunter.setLevel(42);
      System.out.println("level after using overridden method: " + nightElfHunter.level);
   }
}