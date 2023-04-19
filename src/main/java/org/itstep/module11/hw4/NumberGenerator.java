package org.itstep.module11.hw4;

import java.util.stream.Stream;

public class NumberGenerator {
  public Stream<Long> generate(long a, long c, long m) {
    return Stream.iterate(1L, next -> ((next * a) + c) % m);
  }
}
