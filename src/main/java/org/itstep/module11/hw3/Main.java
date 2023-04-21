package org.itstep.module11.hw3;

public class Main {
  public static void main(String[] args) {
    String[] arrayForSort = {"1, 2, 0", "4, 5", "10, 15, 22"};
    ArraySorter arraySorter = new ArraySorter();
    String numberList = arraySorter.sortArray(arrayForSort);
    System.out.println(numberList);
  }
}
