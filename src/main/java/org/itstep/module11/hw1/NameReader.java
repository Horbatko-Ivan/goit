package org.itstep.module11.hw1;

import java.util.List;

public class NameReader {

  public List<String> reader(List<String> listOfName) {
    return listOfName.stream()
      .filter(i -> listOfName.indexOf(i) % 2 == 1)
      .map(i -> listOfName.indexOf(i) + ". " + i)
      .toList();
  }
}
