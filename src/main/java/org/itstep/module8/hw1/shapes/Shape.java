package org.itstep.module8.hw1.shapes;

import org.itstep.module8.hw1.ParameterCalculation;
import org.itstep.module8.hw1.listsenum.ShapeTypeList;

public abstract class Shape implements ParameterCalculation, Printable {

  protected double area;

  protected double perimeter;

  protected ShapeTypeList shapeName;

  protected Shape() {
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
