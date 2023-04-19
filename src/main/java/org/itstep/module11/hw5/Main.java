package org.itstep.module11.hw5;

import java.util.List;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Stream<Integer> first = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
    Stream<Integer> second = Stream.of(-13, -12, -11, 10, 11, 12);
    zip(first, second).forEach(el -> System.out.printf("%s ", el));
  }

  public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
    List<T> firstArr = first.toList();
    List<T> secondArr = second.toList();
    long size = Math.min(firstArr.size(), secondArr.size());
    return Stream.concat(firstArr.parallelStream().limit(size), secondArr.parallelStream().limit(size)).parallel();
  }
}
