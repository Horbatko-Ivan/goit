package org.itstep.module9.hw1stack;

public class LinkedStack<T> implements Stack<T> {
  private Node<T> head;
  private int size;

  @Override
  public void push(T element) {
    Node<T> current = new Node<>(element);
    current.next = head;
    head = current;
    size++;
  }

  @Override
  public void remove(int index) {
    if ((index > size) || (index < 1)) {
      return;
    }
    LinkedStack<T> tmpStack = new LinkedStack<>();
    while (index > 1) {
      tmpStack.push(this.pop());
      index--;
    }
    this.pop();
    while (!tmpStack.isEmpty())
      this.push(tmpStack.pop());
  }

  @Override
  public void clear() {
    if (head == null) {
      return;
    }
    head = new Node<>();
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
  public T pop() {
    if (isEmpty()) {
      return null;
    }
    T element = head.getDataElement();
    head = head.next;
    size--;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Node<T> current = head;
    while (current != null) {
      stringBuilder.append(current.getDataElement());
      stringBuilder.append(" ");
      current = current.next;
    }

    return stringBuilder.toString();
  }
}
