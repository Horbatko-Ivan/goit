package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public class Circle extends Shape {
  private double radius;

  public Circle(ShapeTypeList shapeType, double radius) {
    if (radius > 0) {
      this.shapeName = shapeType;
      this.radius = radius;
    }
  }

  public Circle() {
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    this.calculateArea();
    return this.area;
  }

  @Override
  public void calculateArea() {
    this.area = Math.PI * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    this.calculatePerimeter();
    return this.perimeter;
  }

  @Override
  public void calculatePerimeter() {
    this.perimeter = 2 * Math.PI * radius;
  }

  @Override
  public ShapeTypeList getShapeName() {
    return ShapeTypeList.CIRCLE;
  }

  @Override
  public void printShapeName() {
    System.out.println(getShapeName());
  }

  @Override
  public String toString() {
    return "Circle{" +
      "radius=" + radius +
      ", area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }
}
