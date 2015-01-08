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

   public void add(int positionInList, ListElement newListElement) {
      if(positionInList <= 0 || positionInList > size()) {

      }
      else {
         ListElement previousListElement = getListElementAt(positionInList - 1);
         ListElement nextListElement = getListElementAt(positionInList);
         previousListElement.setNextListElement(newListElement);
         previousListElement.getNextListElement().setNextListElement(nextListElement);
      }
   }

   public void clear() {
      listHead = null;
   }

   public ListElement getListElementAt(int positionInList) {
      if(positionInList <= 0 || positionInList > size()) {
         return null;
      }
      else {
         ListElement helper = listHead;
         int currentPosition = 1;
         while (currentPosition < positionInList) {
            helper = helper.getNextListElement();
            currentPosition++;
         }
         return helper;
      }
   }

   public int positionOf(ListElement listElement) {
      if(listElement == null) {
         return -1;
      }
      else {
         ListElement helper = listHead;
         int currentPosition = 1;
         while(helper != null) {
            if(helper == listElement) {
               break;
            }
            helper = helper.getNextListElement();
            currentPosition++;
         }
         return (currentPosition > size()) ? -1 : currentPosition;
      }
   }

   public boolean isListEmpty() {
      return listHead == null;
   }

   public void removeListElementAt(int positionInList) {
      if(positionInList <= 0 || positionInList > size()) {

      }
      else if(positionInList == 1) {
         listHead = listHead.getNextListElement();
      }
      else {
         ListElement previousListElement = getListElementAt(positionInList - 1);
         previousListElement.setNextListElement(getListElementAt(positionInList + 1));
      }
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

      System.out.println("\n\nList size is : " + list.size());

      System.out.println("\nList element at position 3 is: " + list.getListElementAt(3).getListElementValue());

      System.out.println("\nList after adding a new elemnt at position 4:");
      list.add(4, new ListElement("6"));
      list.listToString(list);

      System.out.println("\n\nList after deleting the 5th list element: ");
      list.removeListElementAt(1);
      list.listToString(list);

      System.out.println("\n\nList element 6 is on position: " + list.positionOf(list.getListElementAt(3)));

   }

   private void listToString(List list) {
      ListElement helper = listHead;

      while(helper != null) {
         System.out.print(helper.toString());
         helper = helper.getNextListElement();
      }
   }
}