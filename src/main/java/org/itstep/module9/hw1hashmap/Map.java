package org.itstep.module9.hw1hashmap;

public interface Map<K, V> {
  void put(K key, V value);

  void remove(K key);

  void clear();

  int size();

  V get(K key);
}
