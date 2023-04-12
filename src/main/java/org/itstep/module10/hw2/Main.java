package org.itstep.module10.hw2;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    String pathToFile = "src/main/java/org/itstep/module10/hw2/";

    ToJsonSerialization toJsonSerialization = new ToJsonSerialization();
    UserFileReader userFileReader = new UserFileReader();

    User[] users = userFileReader.fileReader(pathToFile + "file.txt");

    UserFileWriter.write(pathToFile + "user.json", toJsonSerialization.jsonObj(users));
  }
}
