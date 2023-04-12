package org.itstep.module10.hw2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserFileReader {
  User[] users = new User[0];

  public User[] fileReader(String pathToFile) throws IOException {
    try (FileReader fr = new FileReader(pathToFile); Scanner scan = new Scanner(fr)) {
      int i = 0;
      while (scan.hasNextLine()) {
        String[] userData = scan.nextLine().split(" ");
        if (userData[0].contains("name")) {
          continue;
        }
        resizeIfNeeded(i);
        users[i] = new User(userData[0], Integer.parseInt(userData[1]));
        i++;
      }
    }
    return users;
  }

  private void resizeIfNeeded(int i) {
    if (users.length <= i) {
      User[] newArray = new User[users.length + 1];
      System.arraycopy(users, 0, newArray, 0, i);
      users = newArray;
    }
  }
}
