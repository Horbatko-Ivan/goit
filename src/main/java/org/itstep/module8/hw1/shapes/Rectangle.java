package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public class Rectangle extends Shape {
  private double sideA;
  private double sideB;

  public Rectangle() {
  }

  public Rectangle(ShapeTypeList shapeType, double sideA, double sideB) {
    super();
    if ((sideA > 0) && (sideB > 0)) {
      this.shapeName = shapeType;
      this.sideA = sideA;
      this.sideB = sideB;
    }
  }

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }

  @Override
  public double getArea() {
    this.calculateArea();
    return this.area;
  }

  @Override
  public void calculateArea() {
    this.area = sideA * sideB;
  }

  @Override
  public double getPerimeter() {
    this.calculatePerimeter();

    return this.perimeter;
  }

  @Override
  public void calculatePerimeter() {
    this.perimeter = 2 * (sideA + sideB);
  }

  @Override
  public ShapeTypeList getShapeName() {
    return ShapeTypeList.RECTANGLE;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
      "sideA=" + sideA +
      ", sideB=" + sideB +
      ", area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }
}
