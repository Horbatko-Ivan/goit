package org.itstep.module10.hw2;

public class ToJsonSerialization {
  public String jsonObj(User[] users) {
    StringBuilder result = new StringBuilder();
    int i = 1;
    for (User user : users) {
      if (i == users.length) {
        result.append(user.toString()).append("\n");
      } else {
        result.append(user.toString()).append(",");
      }
      i++;
    }
    return "[" + result + "]";
  }
}
