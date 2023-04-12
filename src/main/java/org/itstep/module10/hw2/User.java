package org.itstep.module10.hw2;

import java.util.Objects;

public record User(String name, int age) {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return age() == user.age() && Objects.equals(name(), user.name());
  }

  @Override
  public int hashCode() {
    return Objects.hash(name(), age());
  }

  @Override
  public String toString() {
    return "\n" +
      "\t{\n" +
      "\t\t" + "\"name\": \"" + name + "\"" + ",\n" +
      "\t\t" + "\"age\":" + age + "\n" +
      "\t}";
  }
}
