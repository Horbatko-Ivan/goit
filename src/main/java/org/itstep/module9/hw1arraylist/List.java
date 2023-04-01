package org.itstep.module9.hw1arraylist;

public interface List<T> {

  int size();

  boolean isEmpty();

  boolean contains(Object o);

  void add(T element);

  void clear();

  T get(int index);

  T getFirst();

  T getLust();

  void set(int index, T element);

  void addByIndex(int index, T element);

  T remove(int index);

  int indexOf(Object o);

  List<T> subList(int fromIndex, int toIndex);
}
