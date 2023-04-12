package org.itstep.module10.hw1;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    MyPhoneReader myPhoneReader = new MyPhoneReader();
    myPhoneReader.checkPhoneNumber("src/main/java/org/itstep/module10/hw1/file.txt");
  }
}
