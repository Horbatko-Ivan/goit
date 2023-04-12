package org.itstep.module10.hw3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyFileReader {
  public String[] fileReader(String pathToFile) throws IOException {
    String[] result = new String[0];
    try (FileReader fr = new FileReader(pathToFile); Scanner scan = new Scanner(fr)) {
      while (scan.hasNextLine()) {
        String[] textData = scan.nextLine().split("\\s+");
        String[] newArray = new String[result.length + textData.length];
        System.arraycopy(textData, 0, newArray, 0, textData.length);
        System.arraycopy(result, 0, newArray, textData.length, result.length);
        result = newArray;
        System.out.println(Arrays.toString(result));
      }
    }

    return result;
  }
}
