package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.ParameterCalculation;
import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public abstract class Shape implements ParameterCalculation {

  protected double area;

  protected double perimeter;

  protected ShapeTypeList shapeName;

  protected Shape() {
  }

  public void printShapeName() {
    System.out.println(getShapeName());
  }

  @Override
  public String toString() {
    return "Shape{" +
      "area=" + area +
      ", perimeter=" + perimeter +
      ", shapeName=" + shapeName +
      '}';
  }
}
