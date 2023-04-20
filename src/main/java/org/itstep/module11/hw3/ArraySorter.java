package org.itstep.module11.hw3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArraySorter {

  public List<Integer> sortArray(String[] dataArray) {
    return Arrays.stream(dataArray)
      .map(s -> Arrays.stream(s.trim().split(","))
        .mapToInt(el -> Integer.parseInt(el.trim()))
        .boxed()
        .toList())
      .flatMap(Collection::stream)
      .sorted()
      .toList();
  }
}
