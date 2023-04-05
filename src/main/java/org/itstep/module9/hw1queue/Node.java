package org.itstep.module9.hw1queue;

public class Node<T> {
  private final T element;
  Node<T> next;

  public Node(T element) {
    this.element = element;
  }

  public T getDataElement() {
    return element;
  }
}
