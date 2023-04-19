package org.itstep.module11.hw3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraySorter {
  private final List<Integer> result = new LinkedList<>();

  public void sortArray(String[] dataArray) {
    Arrays.stream(dataArray)
      .forEach(s -> Arrays.stream(s.trim().split(","))
        .forEach(el -> result.add(Integer.valueOf(el.trim()))));
    Collections.sort(result);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < result.size() - 1; i++) {
      sb.append(result.get(i)).append(", ");
    }
    sb.append(result.get(result.size() - 1));
    System.out.println(sb);
  }
}
