package org.itstep.module9.hw1stack;

public interface Stack<T>{
  void push(T element);
  void remove(int index);
  void clear();
  int size();
  T peek();
  T pop();
  boolean isEmpty();
}
