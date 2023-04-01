package org.itstep.module9.hw1arraylist;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class MyArrayList<T> implements List<T> {

  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elements;
  private int size;

  public MyArrayList(int initCapacity) {
    if (initCapacity < 0) {
      throw new IllegalArgumentException();
    }
    elements = new Object[initCapacity];
  }

  public MyArrayList() {
    this(DEFAULT_CAPACITY);
  }

  @SafeVarargs
  public static <T> List<T> of(T... elements) {
    List<T> list = new MyArrayList<>();
    Stream.of(elements)
      .forEach(list::add);
    return list;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elements[i])) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(T element) {
    resizeIfNeeded();
    elements[size] = element;
    size++;
  }

  private void resizeIfNeeded() {
    if (elements.length == size) {
      Object[] newArray = new Object[elements.length * 2];
      System.arraycopy(elements, 0, newArray, 0, size);
      elements = newArray;
    }
  }

  @Override
  public void clear() {
    size = 0;
    elements = new Object[DEFAULT_CAPACITY];
  }

  @Override
  @SuppressWarnings("unchecked")
  public T get(int index) {
    Objects.checkIndex(index, size);
    return (T) elements[index];
  }

  @Override
  public T getFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return get(0);
  }

  @Override
  public T getLust() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return get(size - 1);
  }

  @Override
  public void set(int index, T element) {
    Objects.checkIndex(index, size);
    elements[index] = element;
  }

  @Override
  public void addByIndex(int index, T element) {
    Objects.checkIndex(index, size + 1);
    resizeIfNeeded();
    System.arraycopy(elements, index, elements, index + 1, size - index);
    elements[index] = element;
    size++;
  }

  @Override
  @SuppressWarnings("unchecked")
  public T remove(int index) {
    Objects.checkIndex(index, size);
    T removedElement = (T) elements[index];
    System.arraycopy(elements, index + 1, elements, index, size - index - 1);
    size--;
    return removedElement;
  }

  @Override
  public int indexOf(Object o) {
    for (int i = 0; i < elements.length; i++) {
      if (o.equals(get(i))) {
        return i;
      }
    }
    return -1;
  }

  @Override
  @SuppressWarnings("unchecked")
  public List<T> subList(int fromIndex, int toIndex) {
    List<T> subList = new MyArrayList<>(toIndex - fromIndex);
    Object[] newArray = new Object[toIndex - fromIndex];
    System.arraycopy(elements, fromIndex, newArray, 0, toIndex - fromIndex);
    for (int i = 0; i < newArray.length; i++) {
      subList.addByIndex(i, (T) newArray[i]);
    }
    return subList;
  }

  @Override
  public String toString() {
    return "MyArrayList{" +
      "elements=" + Arrays.toString(elements) +
      ", size=" + size +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyArrayList<?> that = (MyArrayList<?>) o;
    return size == that.size && Arrays.equals(elements, that.elements);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result + Arrays.hashCode(elements);
    return result;
  }
}
