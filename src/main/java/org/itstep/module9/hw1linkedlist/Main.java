package org.itstep.module9.hw1linkedlist;

public class Main {
  public static void main(String[] args) {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    myLinkedList.add("12");
    myLinkedList.add("13");
    myLinkedList.add("14");
    myLinkedList.add("15");
    myLinkedList.add("16");
    myLinkedList.add("17");

    System.out.print("Size is ");
    System.out.println(myLinkedList.size());

    System.out.print("Get last ");
    System.out.println(myLinkedList.getLast());

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

    System.out.println("add by index 3, value 77");
    myLinkedList.add(3, "77");
    System.out.print("myLinkedList.size " + myLinkedList.size() + "/ ");
    myLinkedList.print();

    System.out.println("add by index 8, value 77");
    myLinkedList.add(8, "77");
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


    System.out.print("Is Empty " + myLinkedList.isEmpty());

  }
}
