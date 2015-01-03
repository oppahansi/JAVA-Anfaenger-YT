/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode026;

public class Modifier {

   /**
    * modifiers :

     modifier    | class  |  package  | subclass  | project
     ------------------------------------------------------
     public      |   Y    |     Y     |    Y      |    Y
     protected   |   Y    |     Y     |    Y      |    N
     no modifier |   Y    |     Y     |    N      |    N
     private     |   Y    |     N     |    N      |    N

    */

   public static void main(String[] args) {
      TestModifier testModifier = new TestModifier();

      System.out.println(testModifier.testPublic);
      System.out.println(testModifier.testPackageModifier);
      System.out.println(testModifier.getTestPrivate());

   }

}