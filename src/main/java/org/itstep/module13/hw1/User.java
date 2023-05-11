package org.itstep.module13.hw1;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
  private int id;
  private String name;
  private String username;
  private String email;
  private UserAddress address;
  private String phone;
  private String website;
  private UserCompany company;

  public User() {
    Faker faker = new Faker();
    this.name = faker.name().fullName();
    this.username = faker.name().username();
    this.email = faker.bothify("????##@gmail.com");
    this.address = new UserAddress();
    this.phone = faker.phoneNumber().phoneNumber();
    this.website = faker.internet().domainName();
    this.company = new UserCompany();
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", username='" + username + '\'' +
      ", email='" + email + '\'' +
      ", address=" + address +
      ", phone='" + phone + '\'' +
      ", website='" + website + '\'' +
      ", company=" + company +
      '}';
  }
}
