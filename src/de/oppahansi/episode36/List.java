/**
 * Created by Alexander Schellenberg alias oppahansi.
 * Created for the JAVA Anfaenger Tutorial on Youtube.
 */

package de.oppahansi.episode36;

public class List {

   private ListElement listHead;

   public List() {
      listHead = null;
   }

   public void add(ListElement newListElement) {
      if(isListEmpty()) {
         listHead = newListElement;
      }
      else {
         ListElement helper = listHead;
         while(helper.getNextListElement() != null) {
            helper = helper.getNextListElement();
         }
         helper.setNextListElement(newListElement);
      }
   }

   public void add(int index, ListElement newListElement) {

   }

   public void clear() {
      listHead = null;
   }

   public ListElement getListElementAt(int positionInList) {
      return new ListElement();
   }

   public int positionOf(ListElement listElement) {
      return 0;
   }

   public boolean isListEmpty() {
      return listHead == null;
   }

   public void removeListElementAt(int positionInList) {

   }

   public int size() {
      if(isListEmpty()) {
         return 0;
      }
      else {
         ListElement helper = listHead;
         int size = 0;
         while (helper != null) {
            size++;
            helper = helper.getNextListElement();
         }
         return size;
      }
   }

   public static void main(String[] args) {
      List list = new List();
      list.add(new ListElement("1"));
      list.add(new ListElement("2"));
      list.add(new ListElement("3"));
      list.add(new ListElement("4"));
      list.add(new ListElement("5"));
      list.listToString(list);
      System.out.println();
      System.out.println("List size is : " + list.size());

   }

   private void listToString(List list) {
      ListElement helper = listHead;

      while(helper != null) {
         System.out.print(helper.toString());
         helper = helper.getNextListElement();
      }
   }
}