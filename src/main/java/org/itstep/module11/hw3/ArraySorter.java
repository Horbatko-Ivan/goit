package org.itstep.module11.hw3;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ArraySorter {

  public String sortArray(String[] dataArray) {
    return Arrays.stream(dataArray)
      .map(s -> Arrays.stream(s.trim().split(","))
        .mapToInt(el -> Integer.parseInt(el.trim()))
        .boxed()
        .toList())
      .flatMap(Collection::stream)
      .sorted()
      .map(Object::toString)
      .collect(Collectors.joining(", "));
  }
}
