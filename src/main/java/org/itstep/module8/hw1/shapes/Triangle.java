package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public class Triangle extends Shape {


  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle() {
  }

  public Triangle(ShapeTypeList shapeType, double sideA, double sideB, double sideC) {
    if ((sideA > 0) && (sideB > 0) && (sideC > 0)
      && ((sideA + sideB > sideC)
      && (sideA + sideC > sideB)
      && (sideC + sideB > sideA))) {
      this.shapeName = shapeType;
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
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

  public double getSideC() {
    return sideC;
  }

  public void setSideC(double sideC) {
    this.sideC = sideC;
  }

  @Override
  public double getArea() {
    this.calculateArea();

    return this.area;
  }

  @Override
  public void calculateArea() {
    double semiPerimeter = (sideA + sideB + sideC) / 2;
    this.area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
      * (semiPerimeter - sideB) * (semiPerimeter - sideC));
  }

  @Override
  public double getPerimeter() {
    this.calculatePerimeter();

    return this.perimeter;
  }

  @Override
  public void calculatePerimeter() {
    this.perimeter = sideA + sideB + sideC;
  }

  @Override
  public ShapeTypeList getShapeName() {
    return ShapeTypeList.TRIANGLE;
  }

  @Override
  public String toString() {
    return "Triangle{" +
      "sideA=" + sideA +
      ", sideB=" + sideB +
      ", sideC=" + sideC +
      ", area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }
}
