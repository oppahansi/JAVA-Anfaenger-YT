package de.oppahansi.episode10;

public class Operators {

   public static void main(String[] args) {

      /**
       * Operators
       *
       * Arithmetic Operators:
       *
       * + , - , * , / , % , ++ , --
       *
       * Relational Operators:
       *
       * == , != , > , < , >= , <=
       *
       * Bitwise Operators:
       *
       * & , | , ^ , ~ , << , >> , >>>
       *
       * Logical Operators:
       *
       * && , || , !
       *
       * Assignment Operators:
       *
       * = , += , -= , *= , /= , %= , <<= , >>= , &= , ^= , |=
       *
       * Misc Operators:
       *
       * (condition) ? true : false
       */

      // Arithmetic Operators - Beispiele
      // <<----------------------------------------------------->> //
      int A = 10;
      int B = 20;

      System.out.println("Arithmetic Operators - Beispiele\n");
      System.out.println("A = 10");
      System.out.println("B = 20");
      System.out.println("A + B = " + (A + B));                      // Addition
      System.out.println("A - B = " + (A - B));                      // Subtraction
      System.out.println("A * B = " + (A * B));                      // Multiplication
      System.out.println("A / B = " + (A / B));                      // Division
      System.out.println("A % B = " + (A % B));                      // Modulus
      A++;
      System.out.println("A nach Inkrementierung: " + A);            // Increment
      B--;
      System.out.println("B nach Dekrementierung: " + B);            // Decrement
      System.out.println();

      // Relational Operators - Beispiele
      // <<----------------------------------------------------->> //
      A = 10;
      B = 20;

      System.out.println("Relational Operators - Beispiele\n");
      System.out.println("A = 10");
      System.out.println("B = 20");
      System.out.println("A == B : " + (A == B));                    // Is A equal to B?
      System.out.println("A != B : " + (A != B));                    // Is A not equal to B?
      System.out.println("A > B : " + (A > B));                      // Is A greater than B?
      System.out.println("A < B : " + (A < B));                      // Is A less than B?
      System.out.println("A >= B : " + (A >= B));                    // Is A greater or equal to B?
      System.out.println("A <= B : " + (A <= B));                    // Is A less or equal to B?
      System.out.println();

      // Bitwise Operators - Beispiele
      // <<----------------------------------------------------->> //
      A = 60;     // 0011 1100
      B = 13;     // 0000 1101

      System.out.println("Bitwise Operators - Beispiele\n");
      System.out.println("A = 60 // 0011 1100");
      System.out.println("B = 13 // 0000 1101");
      System.out.println("A & B = " + (A & B));       // 0000 1100   // binary AND
      System.out.println("A | B = " + (A | B));       // 0011 1101   // binary OR
      System.out.println("A ^ B = " + (A ^ B));       // 0011 0001   // binary XOR
      System.out.println("~A = " + (~A));             // 1100 0011   // binary Ones Complement
      System.out.println("A << 2 = " + (A << 2));     // 1111 0000   // binary Left Shift
      System.out.println("A >> 2 = " + (A >> 2));     // 0000 1111   // binary Right Shift
      System.out.println("A >>> 2 = " + (A >>> 2));   // 0000 1111   // binary Shift righ zero fill
      System.out.println();

      // Logical Operators - Beispiele
      // <<----------------------------------------------------->> //
      boolean trueValue = true;
      boolean falseValue = false;

      System.out.println("Logical Operators - Beispiele\n");
      System.out.println("trueValue && falseValue = " + (trueValue && falseValue));    // logical AND
      System.out.println("trueValue || falseValue = " + (trueValue || falseValue));    // logical OR
      System.out.println("!(trueValue && falseValue) = " + !(trueValue && falseValue));// logical NOT
      System.out.println();

      // Assignment Operators - Beispiele
      // <<----------------------------------------------------->> //
      A = 10;
      B = 20;
      int C;

      System.out.println("Assignment Operators - Beispiele\n");
      System.out.println("A = 10");
      System.out.println("B = 20");
      C = A + B;
      System.out.println("C = A + B -> C = " + C);                      // Assignment
      A += B;
      System.out.println("A += B -> A = A + B : " + A);                 // Addition and Assignment
      A = 10;
      B = 20;
      A -= B;
      System.out.println("A -= B -> A = A - B : " + A);                 // Subtraction and Assignment
      A = 10;
      B = 20;
      A *= B;
      System.out.println("A *= B -> A = A * B : " + A);                 // Multiplication and Assignment
      A = 10;
      B = 20;
      A /= B;
      System.out.println("A /= B -> A = A / B : " + A);                 // Division and Assignment
      A = 10;
      B = 20;
      A %= B;
      System.out.println("A %= B -> A = A % B : " + A);                 // Modulus and Assignment
      A = 60;
      A <<= 2;
      System.out.println("A <<= 2 -> A = A << 2 : " + A);               // Left Shift and Assignment
      A = 60;
      A >>= 2;
      System.out.println("A >>= 2 -> A = A >> 2 : " + A);               // Right Shift and Assignment
      A = 60;
      A &= 2;
      System.out.println("A &= 2 -> A = A & 2 : " + A);                 // binary AND and Assignment
      A = 60;
      A ^= 2;
      System.out.println("A ^= 2 -> A = A ^ 2 : " + A);                 // binary XOR and Assignment
      A = 60;
      A |= 2;
      System.out.println("A |= 2 -> A = A | 2 : " + A);                 // binary OR and Assignment
      System.out.println();

      // Misc Operators - Beispiele
      // <<----------------------------------------------------->> /
      boolean testValue;

      System.out.println("Misc Operators - Beispiele\n");
      testValue = (trueValue == falseValue) ? true : false;             // Conditional Operator ?
      System.out.println("(Condition) ? value if true : value if false");
      System.out.println("trueValue == falseValue -> false");
      System.out.println("testValue = " + testValue);
   }
}