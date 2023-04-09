package org.itstep.module9.hw1hashmap;

import java.util.Objects;

public class Node<K, V> {
  private final K key;
  private V value;
  protected Node<K, V> next;

  public Node(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  @Override
  public String toString() {
    Node<K,V> temp = this;
    StringBuilder sb = new StringBuilder();
    while (temp != null) {
      sb.append(temp.key).append(" -> ").append(temp.value).append(",");
      temp = temp.next;
    }
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Node<?, ?> node = (Node<?, ?>) o;
    return Objects.equals(getKey(), node.getKey()) && Objects.equals(getValue(), node.getValue()) && Objects.equals(next, node.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getKey(), getValue(), next);
  }
}
