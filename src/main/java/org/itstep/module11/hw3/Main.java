package org.itstep.module11.hw3;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    String[] arrayForSort = {"1, 2, 0", "4, 5", "10, 15, 22"};
    ArraySorter arraySorter = new ArraySorter();
    List<Integer> numberList = arraySorter.sortArray(arrayForSort);
    System.out.println(numberList);
  }
}
