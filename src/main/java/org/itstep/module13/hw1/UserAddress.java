package org.itstep.module13.hw1;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAddress {
  private String street;
  private String suite;
  private String city;
  private String zipcode;
  private UserGeo geo;

  public UserAddress() {
    Faker faker = new Faker();
    this.street = faker.address().streetAddress();
    this.suite = faker.address().buildingNumber();
    this.city = faker.address().city();
    this.zipcode = faker.address().zipCode();
    this.geo = new UserGeo();
  }
}
