package org.itstep.module11.hw1;

import java.util.List;

public class Main {
  public static final List<String> NAMES = List.of("Ivan0", "Ivan1", "Ivan2", "Ivan3", "Ivan4", "Ivan5");

  public static void main(String[] args) {
    NameReader nameReader = new NameReader();
    List<String> listNames = nameReader.reader(NAMES);
    System.out.println(listNames);
  }
}
