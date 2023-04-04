package org.itstep.module9.hw1linkedlist;

public interface List<E> {
  void add(E element);

  void add(int index, E element);

  void addFirst(E element);

  void removeAt(int index);

  E get(int index);

  E getFirst();

  E getLast();

  void removeLast();

  boolean contains(E element);

  boolean isEmpty();

  int size();

  void clear();

  void print();

  void removeFirst();
}
