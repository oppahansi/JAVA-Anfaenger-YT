package de.oppahansi.episode23;

public class OppaClassTest {

   public static void main(String[] args) {
      OppaHansi oppaTest = new OppaHansi();
      OppaHansi oppaHansi = new OppaHansi('O');

      System.out.println("groesse von oppaTest: " + oppaTest.getGroesse());
      System.out.println("groesse von oppaHansi: " + oppaHansi.getGroesse());
      System.out.println("initialeVorname von oppaHansi: " + oppaHansi.getInitialeVorname());

      oppaHansi.setGroesse(1337);

      System.out.println();
      System.out.println("groesse von oppaHansi: " + oppaHansi.getGroesse());
   }
}