package org.itstep.module9.hw1linkedlist;

import java.util.Objects;

public class MyLinkedList<T> implements List<T> {

  private Node<T> head;
  private Node<T> tail;
  private int size;

  public MyLinkedList() {
    head = tail = null;
    size = 0;
  }

  @Override
  public void add(T element) {
    Node<T> current = new Node<>(element);
    if (head == null) {
      head = tail = current;
      head.prev = null;
      tail.next = null;
    } else {
      tail.next = current;
      current.prev = tail;
      this.tail = current;
    }
    size++;
  }

  @Override
  public void add(int index, T element) {
    if (index < 0 || index > size - 1) return;
    if (head == null) {
      if (index == 0) {
        addFirst(element);
        return;
      } else {
        return;
      }
    }
    if (index == size - 1) {
      add(element);
      return;
    }
    Node<T> newNode = new Node<>(element);
    Node<T> current = head;
    while (index > 1) {
      current = current.next;
      index--;
    }
    newNode.prev = current;
    newNode.next = current.next;
    current.next = newNode;
    newNode.next.prev = newNode;
    size++;
  }

  @Override
  public void addFirst(T element) {
    Node<T> current = new Node<>(element);
    if (head == null) {
      tail = current;
    } else {
      head.prev = current;
    }
    current.next = head;
    head = current;
    size++;
  }

  @Override
  public void removeAt(int index) {
    if (head == null) return;
    if (index < 0 || index > size - 1) return;
    if (index == 0) {
      removeFirst();
      return;
    }
    if (index == size - 1) {
      removeLast();
      return;
    }
    Node<T> current = head;

    while (index >= 1 && current != null) {
      current = current.next;
      index--;
    }

    if ((current == null) || (current.next == null)) {
      return;
    }
    current.next.prev = current.prev;
    current.prev.next = current.next;
    size--;
  }

  @Override
  public T get(int index) {
    if (head == null) return null;
    if (index < 0 || index > size - 1) {
      throw new IllegalArgumentException();
    }
    Node<T> current = head;

    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.getDataElement();
  }

  @Override
  public T getFirst() {
    return head.getDataElement();
  }

  @Override
  public T getLast() {
    return tail.getDataElement();
  }

  @Override
  public void removeLast() {
    if (head == null) return;
    if (head.next == null) {
      head = null;
      size--;
      return;
    }
    Node<T> current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    current.next = null;
    tail = current;
    size--;
  }

  @Override
  public boolean contains(T element) {
    if (head == null) return false;
    Node<T> current = head;
    while (current != null) {
      if (current.getDataElement().equals(element)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public void print() {
    Node<T> current = head;
    while (current != null) {
      System.out.print(current.getDataElement() + " ");
      current = current.next;
    }
    System.out.println();
  }

  @Override
  public void removeFirst() {
    if (head == null) return;
    head = head.next;
    head.prev = null;
    size--;
  }

  @Override
  public String toString() {
    return "MyLinkedList{" +
      "head=" + head +
      ", tail=" + tail +
      ", size=" + size +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyLinkedList<?> that = (MyLinkedList<?>) o;
    return size == that.size && Objects.equals(head, that.head) && Objects.equals(tail, that.tail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(head, tail, size);
  }

  public Node<T> getHead() {
    return head;
  }

  public Node<T> getTail() {
    return tail;
  }
}
