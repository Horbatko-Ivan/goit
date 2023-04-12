package org.itstep.module10.hw1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {
  private Validator validator;

  @BeforeEach
  void setUp() {
    validator = new Validator();
  }

  @Test
  void isValid() {
    assertFalse(validator.isValid("123 456 7890"));
  }

  @Test
  void isValid2() {
    assertFalse(validator.isValid("123456 7890"));
  }

  @Test
  void isValid3() {
    assertFalse(validator.isValid("1234567890"));
  }

  @Test
  void isValid4() {
    assertFalse(validator.isValid("(123) (456)-7890"));
  }

  @Test
  void isValid5() {
    assertFalse(validator.isValid("(123)-456-7890"));
  }

  @Test
  void isValid6() {
    assertTrue(validator.isValid("(123) 456-7890"));
  }

  @Test
  void isValid7() {
    assertTrue(validator.isValid("987-123-4567"));
  }

  @Test
  void isValid8() {
    assertFalse(validator.isValid("987-123-456744"));
  }

  @Test
  void isValid9() {
    assertFalse(validator.isValid("987-123-4567dd"));
  }

  @Test
  void isValid10() {
    assertFalse(validator.isValid("(123) d56-7890"));
  }

  @Test
  void isValid11() {
    assertFalse(validator.isValid("987-123-45dd"));
  }
}
