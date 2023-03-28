package org.itstep.module8.hw1;

import org.itstep.module8.hw1.shapes.*;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    IsoscelesTrapezium isoscelesTrapezium = new IsoscelesTrapezium();
    Triangle triangle = new Triangle();

    circle.printShapeName();
    rectangle.printShapeName();
    square.printShapeName();
    isoscelesTrapezium.printShapeName();
    triangle.printShapeName();
  }
}
