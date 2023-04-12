package org.itstep.module10.hw3;

import java.io.IOException;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) throws IOException {
    String pathToFile = "src/main/java/org/itstep/module10/hw3/";
    MyFileReader myFileReader = new MyFileReader();
    HashMap<String, Integer> wordToCount = new HashMap<>();
    CalculationService wordsCalculation = new CalculationService();

    String[] words = myFileReader.fileReader(pathToFile + "words.txt");

    wordsCalculation.wordsCounter(wordToCount, words);
  }


}
