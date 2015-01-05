/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode36;

public class ListElement {

   private ListElement nextListElement;
   private String listElementValue;

   public ListElement() {
      nextListElement = null;
      listElementValue = "default";
   }

   public ListElement(String listElementValue) {
      nextListElement = null;
      this.listElementValue = listElementValue;
   }

   public void setNextListElement(ListElement nextListElement) {
      this.nextListElement = nextListElement;
   }

   public ListElement getNextListElement() {
      return nextListElement;
   }

   public void setListElementValue(String listElementValue) {
      this.listElementValue = listElementValue;
   }

   public String getListElementValue() {
      return listElementValue;
   }

   public String toString() {
      return "[" + listElementValue + "]->";
   }
}
