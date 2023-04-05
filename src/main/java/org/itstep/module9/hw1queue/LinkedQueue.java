package org.itstep.module9.hw1queue;

import java.util.Objects;

public class LinkedQueue<T> implements Queue<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  @Override
  public void add(T element) {
    Node<T> current = new Node<>(element);
    if (head == null) {
      head = current;
    }
    if (tail != null) {
      tail.next = current;
    }
    tail = current;
    size++;
  }

  @Override
  public void clear() {
    head = tail = null;
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public T peek() {
    return head.getDataElement();
  }

  @Override
  public T poll() {
    Node<T> current = head;
    if (!isEmpty()) {
      head = head.next;
      size--;
      if (head == null) {
        tail = null;
      }
      return current.getDataElement();
    } else {
      return null;
    }
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public Node<T> getHead() {
    return head;
  }

  public void setHead(Node<T> head) {
    this.head = head;
  }

  public Node<T> getTail() {
    return tail;
  }

  public void setTail(Node<T> tail) {
    this.tail = tail;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedQueue<?> that = (LinkedQueue<?>) o;
    return getSize() == that.getSize() && Objects.equals(getHead(), that.getHead()) && Objects.equals(getTail(), that.getTail());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHead(), getTail(), getSize());
  }

  @Override
  public String toString() {
    return "LinkedQueue{" +
      "head=" + head +
      ", tail=" + tail +
      ", size=" + size +
      '}';
  }
}
