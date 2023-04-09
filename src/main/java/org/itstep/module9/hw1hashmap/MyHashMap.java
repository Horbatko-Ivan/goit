package org.itstep.module9.hw1hashmap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements Map<K, V> {
  private static final int CAPACITY = 5;
  private Node<K, V>[] table;

  private V value;
  private K keyField;
  private int size;

  public MyHashMap(V value, K keyField) {
    this.value = value;
    this.keyField = keyField;
  }

  public MyHashMap() {
    table = new Node[CAPACITY];
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public K getKeyField() {
    return keyField;
  }

  @Override
  public void put(K key, V value) {
    int hash = keyHash(key);
    Node<K, V> current = table[hash];
    if (current != null) {
      if (current.getKey().equals(key)) {
        current.setValue(value);
      } else {
        while (current.next != null) {
          current = current.next;
        }
        current.next = new Node<>(key, value);
        size++;
      }
    } else {
      Node<K, V> newBucket = new Node<>(key, value);
      table[hash] = newBucket;
      size++;
    }
  }

  @Override
  public void remove(K key) {
    int hash = keyHash(key);
    Node<K, V> previous = null;
    Node<K, V> current = table[hash];
    while (current != null){
      if(current.getKey().equals(key)){
        if(previous == null){
          current = current.next;
          table[hash] = current;
          size--;
          return;
        }else {
          previous.next = current.next;
          size--;
          return;
        }
      }
      previous = current;
      current = current.next;
    }
  }

  @Override
  public void clear() {
    table = new Node[CAPACITY];
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }

  private int keyHash(K key) {
    return key.hashCode() % CAPACITY;
  }

  @Override
  public V get(K key) {
    int hash = keyHash(key);
    Node<K, V> current = table[hash];
    if (current == null) {
      return null;
    }
    while (current != null) {
      if (current.getKey() == key) {
        return current.getValue();
      }
      current = current.next;
    }

    return null;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < CAPACITY; i++) {
      if (table[i] != null) {
        sb.append(i).append(" ").append(table[i]).append("\n");
      } else {
        sb.append(i).append(" ").append("null").append("\n");
      }
    }
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
    return size == myHashMap.size && Arrays.equals(table, myHashMap.table) && Objects.equals(getValue(), myHashMap.getValue()) && Objects.equals(getKeyField(), myHashMap.getKeyField());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(getValue(), getKeyField(), size);
    result = 31 * result + Arrays.hashCode(table);
    return result;
  }
}
