/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode19;

public class IfCondition {

   public static void main(String[] args) {
      /**
       * if condition / statement - Syntax
       *
       * if (booleanExpression) {
       *    // Executes when booleanExpression is true
       * }
       */

      int value = 30;

      if (value > 0) {
         System.out.println("The value IS greater 0!");
      }


      //<<----------------------------------------------------->>//
      /**
       * if...else condition / statement - Syntax
       *
       * if (booleanExpression) {
       *    // Executes when booleanExpression is true
       * }
       * else {
       *    // Executes when booleanExpression is false
       * }
       */

      if (value > 20) {
         System.out.println("The value IS greater 20!");
      }
      else {
         System.out.println("The value IS NOT greater 20!");
      }


      //<<----------------------------------------------------->>//
      /**
       * if...else if...else condition / statement - Syntax
       *
       * if (booleanExpression 1) {
       *    // Executes when booleanExpression 1 is true
       * }
       * else if(booleanExpression 2){
       *    // Executes when booleanExpression 1 is false and booleanExpression 2 is true
       * }
       * else {
       *    // Executes when booleanExpression 1 and 2 are false
       * }
       */

      boolean expressionOne = false;
      boolean expressionTwo = true;


      if (expressionOne == true) {
         System.out.println("The expressionOne IS true!");
      }
      else if (expressionTwo == true) {
         System.out.println("The expressionOne is false and the expressionTwo is true!");
      }
      else {
         System.out.println("The expressionOne is false and the expressaionTwo is false!");
      }


      //<<----------------------------------------------------->>//
      /**
       * Sonstige Beispiele
       */

      if (expressionOne == true) {
         System.out.println("");
      }
      else if (expressionTwo == true) {
         System.out.println("");
      }
      else if (expressionOne == false) {
         System.out.println("");
      }
      else if (expressionTwo == false) {
         System.out.println("");
      }
      else if (expressionOne == true) {
         System.out.println("");
      }
      else {
         System.out.println("The expressionOne is false and the expressaionTwo is false!");
      }

      if (expressionOne == true) {
         System.out.println("");
      }
      if (expressionOne == true) {
         System.out.println("");
      }
      if (expressionOne == true) {
         System.out.println("");
      }
      if (expressionOne == true) {
         System.out.println("");
      }

      if (false) {

         if (true) {

            if (expressionOne == true) {
               System.out.println("");
            }
            else {

            }
         }
      }else if(false) {

      }
   }
}