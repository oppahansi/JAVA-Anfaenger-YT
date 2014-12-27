package de.oppahansi.episode14;

public class Assignment {

   public static void main(String[] args) {
      /**
       * Assignment Operators:
       *
       * = , += , -= , *= , /= , %= , <<= , >>= , &= , ^= , |=
       */

      int A = 10;
      int B = 20;
      int C;

      System.out.println("Assignment Operators - Beispiele\n");
      System.out.println("A = 10");
      System.out.println("B = 20");
      C = A + B;
      System.out.println("C = A + B -> C = " + C);                      // Assignment
      A += B;
      System.out.println("A += B -> A = A + B : " + A);                 // Addition and Assignment
      A = 10;
      A -= B;
      System.out.println("A -= B -> A = A - B : " + A);                 // Subtraction and Assignment
      A = 10;
      A *= B;
      System.out.println("A *= B -> A = A * B : " + A);                 // Multiplication and Assignment
      A = 10;
      A /= B;
      System.out.println("A /= B -> A = A / B : " + A);                 // Division and Assignment
      A = 10;
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
   }
}