package de.oppahansi.episode23;

public class OppaHansi {

   private String vorname = "Oppa";
   private String nachname = "Hansi";
   private int alter = 42;
   private int groesse;
   private char initialeVorname;


   public OppaHansi() {
      groesse = 1337;
   }

   public OppaHansi(char initialeVorname) {
      this.initialeVorname = initialeVorname;
   }

   public String getNachname() {
      return nachname;
   }

   public void setNachname(String nachname) {
      this.nachname = nachname;
   }

   public int getAlter() {
      return alter;
   }

   public void setAlter(int alter) {
      this.alter = alter;
   }

   public int getGroesse() {
      return groesse;
   }

   public void setGroesse(int groesse) {
      this.groesse = groesse;
   }

   public char getInitialeVorname() {
      return initialeVorname;
   }

   public void setInitialeVorname(char initialeVorname) {
      this.initialeVorname = initialeVorname;
   }

   public String getVorname() {
      return vorname;
   }

   public void setVorname(String vorname) {
      this.vorname = vorname;
   }
}
