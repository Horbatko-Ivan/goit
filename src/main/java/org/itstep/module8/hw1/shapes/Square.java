package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public class Square extends Shape {

  private double side;

  public Square(ShapeTypeList shapeType, double side) {
    if (side > 0) {
      this.shapeName = shapeType;
      this.side = side;
    }
  }

  public Square() {
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
    this.area = Math.pow(side, 2);
  }

  @Override
  public double getPerimeter() {
    this.calculatePerimeter();

    return this.perimeter;
  }

  @Override
  public void calculatePerimeter() {
    this.perimeter = 4 * side;
  }

  @Override
  public ShapeTypeList getShapeName() {
    return ShapeTypeList.SQUARE;
  }

  @Override
  public String toString() {
    return "Square{" +
      "side=" + side +
      ", area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }
}
