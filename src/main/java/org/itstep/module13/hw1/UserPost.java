package org.itstep.module13.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserPost {
  private int userId;
  private int id;
  private String title;
  private String body;

  @Override
  public String toString() {
    return "PostDto{" +
      "userId=" + userId +
      ", id=" + id +
      ", title='" + title + '\'' +
      ", body='" + body + '\'' +
      '}';
  }
}
