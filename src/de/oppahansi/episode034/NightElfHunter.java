/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode034;

public class NightElfHunter extends NightElf {

  private String classSkillBonus;

  public NightElfHunter(String name) {
    super(name);
    classSkillBonus = "Bow +25";
  }

  public String getClassSkillBonus() {
    return classSkillBonus;
  }
}