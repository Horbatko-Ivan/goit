package org.itstep.module9.hw1arraylist;

public class Main {
  public static void main(String[] args) {
    MyArrayList<Integer> myArrayList = new MyArrayList<>(10);
    for (int i = 0; i < 10; i++) {
      myArrayList.add((int) (Math.random() * 10));
    }
    System.out.println("myArrayList" + myArrayList);

    for (int i = 0; i < 15; i++) {
      myArrayList.addByIndex(i, (int) (Math.random() * 10));
    }
    System.out.println("myArrayList" + myArrayList);
    System.out.println("myArrayList subList" + myArrayList.subList(4, 8));
    System.out.println("myArrayList indexOf" + myArrayList.indexOf(5));
    System.out.println("myArrayList getFirst" + myArrayList.getFirst());
    System.out.println("myArrayList getLust" + myArrayList.getLast());
    System.out.println("myArrayList size" + myArrayList.size());
    System.out.println("myArrayList contains " + myArrayList.contains(3));
    myArrayList.add(50);
    System.out.println("myArrayList add element " + myArrayList);
    myArrayList.addByIndex(9, 5);
    System.out.println("myArrayList add element by index" + myArrayList);
    myArrayList.addByIndex(5, 30);
    System.out.println("myArrayList add element by index" + myArrayList);
    System.out.println("myArrayList remove element by index" + myArrayList.remove(6));
    myArrayList.set(0, 22);
    System.out.println("myArrayList set " + myArrayList);
    System.out.println("new instance of List " + MyArrayList.of(1, 3, 5, 7));
    myArrayList.clear();
    System.out.println("myArrayList clear" + myArrayList);
    System.out.println("myArrayList isEmpty " + myArrayList.isEmpty());
  }
}
