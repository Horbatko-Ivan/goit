package org.itstep.module11.hw2;

import java.util.List;

public class Main {
  private static final List<String> NAMES = List.of("Ivan0", "Ivan1", "Ivan2", "Ivan3", "Ivan4", "Ivan5", "Anton", "Michail");

  public static void main(String[] args) {

    NameSorter nameSorter = new NameSorter();

    List<String> sortedListNames = nameSorter.sorter(NAMES);
    System.out.println(sortedListNames);
  }
}
