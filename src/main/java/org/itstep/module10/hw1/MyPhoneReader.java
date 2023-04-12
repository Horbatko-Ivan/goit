package org.itstep.module10.hw1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyPhoneReader {

  public void checkPhoneNumber(String pathToFile) throws IOException {
    Validator validator = new Validator();
    int i = 1;
    try (FileReader fr = new FileReader(pathToFile); Scanner scan = new Scanner(fr)) {
      while (scan.hasNextLine()) {
        String checkPhone = scan.nextLine();
        if (validator.isValid(checkPhone)) {
          System.out.printf("%d phone number is %s %n", i, checkPhone);
          i++;
        }
      }
    }
  }
}
