package org.itstep.module11.hw2;

import java.util.*;

public class NameSorter {

  public List<String> sorter(List<String> listOfName) {
    return listOfName.stream()
      .map(String::toUpperCase)
      .sorted(Comparator.reverseOrder())
      .toList();
  }
}
