package org.itstep.module11.hw1;

import java.util.HashMap;
import java.util.Map;

public class NameReader {

  public void reader(String listOfName) {
    Map<Integer, String> mapOfName = new HashMap<>();
    String[] arrayOfNames = listOfName.split(",");
    int i = 0;
    for (String element : arrayOfNames) {
      mapOfName.put(i, element.trim());
      i++;
    }
    mapOfName.entrySet().stream()
      .filter(entry -> entry.getKey() % 2 != 0)
      .forEach(v -> System.out.printf("%d. %s, ", v.getKey(), v.getValue()));
  }
}
