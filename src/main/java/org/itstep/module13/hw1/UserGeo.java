package org.itstep.module13.hw1;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserGeo {
  private String lat;
  private String lng;

  public UserGeo() {
    Faker faker = new Faker();
    this.lat = faker.regexify("-?[1-9]{2}.[1-9]{4}");
    this.lng = faker.regexify("-?[1-9]{2}.[1-9]{4}");
  }
}
