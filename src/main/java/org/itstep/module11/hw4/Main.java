package org.itstep.module11.hw4;

public class Main {
  public static void main(String[] args) {
    NumberGenerator numberGenerator = new NumberGenerator();
    numberGenerator.generate(25214903917L, 11L, 2 ^ 48L).forEach(el -> System.out.printf("%s ", el));
  }
}
