package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public class IsoscelesTrapezium extends Shape {

  private double baseUp;
  private double baseDown;
  private double side;

  public IsoscelesTrapezium() {
  }

  public IsoscelesTrapezium(ShapeTypeList shapeType, double baseUp, double baseDown, double side) {
    this.shapeName = shapeType;
    this.baseUp = baseUp;
    this.baseDown = baseDown;
    this.side = side;
  }

  public double getBaseUp() {
    return baseUp;
  }

  public void setBaseUp(double baseUp) {
    this.baseUp = baseUp;
  }

  public double getBaseDown() {
    return baseDown;
  }

  public void setBaseDown(double baseDown) {
    this.baseDown = baseDown;
  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    this.calculateArea();
    return this.area;
  }

  @Override
  public void calculateArea() {
    this.area = ((baseUp + baseDown) / 2) * Math.sqrt(Math.pow(side, 2) - Math.pow((baseDown - baseUp), 2) / 4);
  }

  @Override
  public double getPerimeter() {
    this.calculatePerimeter();
    return this.perimeter;
  }

  @Override
  public void calculatePerimeter() {
    this.perimeter = side * 2 + baseUp + baseDown;
  }

  @Override
  public ShapeTypeList getShapeName() {
    return ShapeTypeList.ISOSCELES_TRAPEZIUM;
  }

  @Override
  public String toString() {
    return "IsoscelesTrapezium{" +
      "baseUp=" + baseUp +
      ", baseDown=" + baseDown +
      ", side=" + side +
      ", area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }

  @Override
  public void printShapeName() {
    System.out.println(getShapeName());
  }
}
