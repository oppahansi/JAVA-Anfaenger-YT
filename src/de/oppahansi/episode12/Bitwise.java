package de.oppahansi.episode12;

public class Bitwise {

   public static void main(String[] args) {
      /**
       * Bitwise Operators:
       *
       * & , | , ^ , ~ , << , >> , >>>
       */

      /**   - & -
       A       B      Result
      TRUE  | TRUE  | TRUE
      TRUE  | FALSE | FALSE
      FALSE | TRUE  | FALSE
      FALSE	| FALSE | FALSE

      Example:
         10011010
       & 10101011
       = 10001010
      */

      /**   - | -
       A       B      Result
       TRUE  | TRUE  | TRUE
       TRUE  | FALSE | TRUE
       FALSE | TRUE  | TRUE
       FALSE | FALSE | FALSE

       Example:
          10011010
        | 10101011
        = 10111011
       */

      /**   - ^ -
       A       B      Result
       TRUE  | TRUE  | FALSE
       TRUE  | FALSE | TRUE
       FALSE | TRUE  | TRUE
       FALSE | FALSE | FALSE

       Example:
          10011010
        ^ 10101011
        = 00110001
       */

      /**   - ~ -
       A       Result
       TRUE  | FALSE
       FALSE | TRUE

       Example:
          00110101
        ~ 11001010
       */

      int A = 60;    // 0011 1100
      int B = 13;    // 0000 1101

      System.out.println("Bitwise Operators - Beispiele\n");
      System.out.println("A = 60   // 0011 1100");
      System.out.println("B = 13   // 0000 1101");
      System.out.println("A & B = " + (A & B));       // 0000 1100   // binary AND
      System.out.println("A | B = " + (A | B));       // 0011 1101   // binary OR
      System.out.println("A ^ B = " + (A ^ B));       // 0011 0001   // binary XOR
      System.out.println("~A = " + (~A));             // 1100 0011   // binary Ones Complement
      System.out.println("A << 2 = " + (A << 2));     // 1111 0000   // binary Left Shift
      System.out.println("A >> 2 = " + (A >> 2));     // 0000 1111   // binary Right Shift
      System.out.println("A >>> 2 = " + (A >>> 2));   // 0000 1111   // binary Shift righ zero fill
   }
}