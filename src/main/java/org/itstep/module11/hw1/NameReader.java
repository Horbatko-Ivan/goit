package org.itstep.module11.hw1;

import java.util.List;
import java.util.stream.Collectors;

public class NameReader {

  public String reader(List<String> listOfName) {
    return listOfName.stream()
      .filter(i -> listOfName.indexOf(i) % 2 == 1)
      .map(i -> listOfName.indexOf(i) + ". " + i)
      .collect(Collectors.joining(", "));
  }
}
