package de.oppahansi.episode034;

public class Human extends Player {

   private String raceBonus;

   public Human(final String name) {
      super(name);
      raceBonus = "Wille -42";
   }

   public String getRaceBonus() {
      return raceBonus;
   }
}