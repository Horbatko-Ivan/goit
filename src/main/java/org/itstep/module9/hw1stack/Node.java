package org.itstep.module9.hw1stack;

public class Node<T> {
  private T element;
  Node<T> next;

  public Node(T element) {
    this.element = element;
  }

  public Node() {
  }

  public T getDataElement() {
    return element;
  }
}
