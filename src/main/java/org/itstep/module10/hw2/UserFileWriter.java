package org.itstep.module10.hw2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class UserFileWriter {

  private UserFileWriter() {
    throw new IllegalStateException("Utility class");
  }

  public static void write(String fileName, String text) {
    File file = new File(fileName);

    try {
      if (!file.exists()) {
        System.out.println("file.createNewFile() write = " + file.createNewFile());
      }

      try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
        out.print(text);
      }
    } catch (IOException e) {
      throw new UserException("Input/Output error");
    }
  }
}
