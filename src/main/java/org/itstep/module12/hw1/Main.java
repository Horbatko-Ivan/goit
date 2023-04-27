package org.itstep.module12.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    TimeCounter timeCounter = new TimeCounter();
    timeCounter.start();
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    consoleReader.readLine();
    timeCounter.interrupt();
  }
}
