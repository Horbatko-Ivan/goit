package org.itstep.module9.hw1queue;

public interface Queue<T>{
  void add(T element);
  void clear();
  int size();
  T peek();
  T poll();
  boolean isEmpty();
}
