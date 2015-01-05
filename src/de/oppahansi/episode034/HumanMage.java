package de.oppahansi.episode034;

public class HumanMage extends Human {

   private String classBonus;

   public HumanMage(final String name) {
      super(name);
      classBonus = "Intelligenz +42";
   }

   public String getClassBonus(){
      return classBonus;
   }
}
