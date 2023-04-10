package org.itstep.module9.hw1linkedlist;

public class Main {
  public static void main(String[] args) {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    myLinkedList.add("12");
    myLinkedList.add("13");

    myLinkedList.removeAt(1);
    System.out.println("Removed at 1 ");
    System.out.println("myLinkedList.size " + myLinkedList.size() + "/ " + " tail " + myLinkedList.getTail().getDataElement());
    myLinkedList.print();

    myLinkedList.add("14");
    myLinkedList.add("15");
    myLinkedList.add("16");
    myLinkedList.add("17");

    System.out.print("Size is ");
    System.out.println(myLinkedList.size());

    System.out.print("Get last ");
    System.out.println(myLinkedList.getLast());

    System.out.print("Remove last ");
    myLinkedList.removeLast();
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    System.out.println("Add first 66");
    myLinkedList.addFirst("66");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    System.out.print("Get first ");
    System.out.println(myLinkedList.getFirst());

    System.out.print("Get position 1 ");
    System.out.println(myLinkedList.get(1));

    System.out.print("Get position 6 ");
    System.out.println(myLinkedList.get(6));

    System.out.print("contains 6 ? ");
    System.out.println(myLinkedList.contains("6"));

    System.out.print("contains 16 ? ");
    System.out.println(myLinkedList.contains("16"));

    System.out.println("add by index 3, value 77");
    myLinkedList.add(3, "77");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    System.out.println("add by index 8, value 77");
    myLinkedList.add(7, "77");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    myLinkedList.removeFirst();
    System.out.print("Removed first ");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    myLinkedList.removeAt(7);
    System.out.println("Removed at 7 ");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    myLinkedList.clear();
    System.out.println("Clear list size is " + myLinkedList.size());
    myLinkedList.print();


    System.out.print("Is Empty " + myLinkedList.isEmpty());

  }
}
