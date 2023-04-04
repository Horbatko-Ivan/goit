package org.itstep.module9.hw1linkedlist;

public class Node<T> {
   T element;
   Node<T> next;
   Node<T> prev;

  protected Node(T element) {
    this.element = element;
    prev = next = null;
  }

  protected Node(Node<T> next, T element, Node<T> prev) {
    this.element = element;
    this.next = next;
    this.prev = prev;
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
