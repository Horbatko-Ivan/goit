package org.itstep.module13.hw1;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserCompany {
  private String name;
  private String catchPhrase;
  private String bs;

  public UserCompany() {
    Faker faker = new Faker();
    this.name = faker.company().name();
    this.catchPhrase = faker.company().catchPhrase();
    this.bs = faker.company().bs();
  }
}
