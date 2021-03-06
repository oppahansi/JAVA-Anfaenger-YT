/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode024;

public class Overloading {

  private String name;
  private int age;

  public Overloading() {
    name = "TestConstructor";
    age = 21;
  }

  public Overloading(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * TEST OVERLOADING
   */

  public static void main(String[] args) {
    Overloading overload = new Overloading();
    System.out.println(overload.getName() + " " + overload.getAge());
    System.out.println();
    overload.reInitialize("TESTPARAMETER");
    System.out.println(overload.getName() + " " + overload.getAge());
    System.out.println();
    overload.reInitialize("TESTPARAMETER", 42);
    System.out.println(overload.getName() + " " + overload.getAge());
    System.out.println();
    overload.reInitialize();
    System.out.println(overload.getName() + " " + overload.getAge());
  }

  public void reInitialize() {
    name = "TestConstructor";
    age = 21;
  }

  public void reInitialize(String name) {
    this.name = name;
  }

  public void reInitialize(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}