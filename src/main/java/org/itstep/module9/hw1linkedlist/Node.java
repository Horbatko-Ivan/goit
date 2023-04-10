package org.itstep.module9.hw1linkedlist;

public class Node<T> {
  T element;
  Node<T> next;
  Node<T> prev;

  protected Node(T element) {
    this.element = element;
    prev = next = null;
  }

  public T getDataElement() {
    return element;
  }

  @Override
  public String toString() {
    return "Node{" +
      "element=" + element +
      ", next=" + next +
      ", prev=" + prev +
      '}';
  }
}
