package org.itstep.module11.hw2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NameSorter {

  public void reader(String listOfName) {
    Map<Integer, String> mapOfName = new HashMap<>();
    String[] arrayOfNames = listOfName.split(",");
    int i = 0;
    for (String element : arrayOfNames) {
      mapOfName.put(i, element.trim());
      i++;
    }
    mapOfName.entrySet().stream()
      .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
      .forEach(v -> System.out.printf("%d. %s, ", v.getKey(), v.getValue()));
  }
}
