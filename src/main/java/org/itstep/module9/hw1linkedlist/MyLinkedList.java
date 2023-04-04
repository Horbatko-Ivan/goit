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
    if (head == null) {
      head = new Node<>(null, element, null);
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = tail = new Node<>(null, element, current);
    }
    size++;
  }

  @Override
  public void add(int index, T element) {
    if (index < 1 || index > size) return;
    if (head == null) {
      if (index == 1) {
        head = tail = new Node<>(null, element, null);
        size++;
      } else {
        return;
      }
    }
    if (index == 1) {
      Node<T> newNode = new Node<>(element);
      head.prev = newNode;
      newNode.next = head;
      size++;
      return;
    }
    Node<T> current = head;
    while (current != null && index > 2) {
      current = current.next;
      index--;
    }
    if (current == null) {
      head = tail = new Node<>(null, element, null);
    } else {
      Node<T> newNode = new Node<>(current.prev, element, current);
      newNode.next = current.next;
      newNode.prev = newNode;
      if (current.next != null) {
        current.next.prev = newNode;
      }
      current.next = tail = newNode;
      size++;
    }
  }

  @Override
  public void addFirst(T element) {
    Node<T> newNode = new Node<>(head, element, null);
    if (head != null) {
      head.prev = newNode;
    }
    head = newNode;
    if (tail == null) {
      tail = newNode;
    }
    size++;
  }

  @Override
  public void removeAt(int index) {
    if (head == null) return;
    if (index < 1 || index > size) return;
    if (index == 1) {
      removeFirst();
      return;
    }
    Node<T> current = head;

    while (index > 2 && current != null) {
      current = current.next;
      index--;
    }

    if ((current == null) || (current.next == null)) {
      return;
    }
    current.next = current.next.next;
    size--;
  }

  @Override
  public T get(int index) {
    if (head == null) return null;
    if (index < 1 || index > size) {
      throw new IllegalArgumentException();
    }
    Node<T> current = head;

    for (int i = 1; i < index; i++) {
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
    while (current.next != null) {
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
    Node<T> newNode = new Node<>(null);
    tail = newNode;
    while (this.head != null) {
      newNode = this.head;
      this.head = this.head.next;
      newNode = new Node<>(null);
      size--;
    }
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
}
