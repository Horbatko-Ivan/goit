package org.itstep.module10.hw3;

import java.util.HashMap;
import java.util.Map;

public class CalculationService {

  public static void wordsCounter(Map<String, Integer> wordToCount, String[] words) {
    for (String word : words) {
      if (!wordToCount.containsKey(word)) {
        wordToCount.put(word, 0);
      }
      wordToCount.put(word, wordToCount.get(word) + 1);
    }

    wordToCount.entrySet().stream()
      .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
      .forEach(System.out::println);
  }
}
