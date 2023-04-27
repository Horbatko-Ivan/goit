package org.itstep.module12.hw1;

public class TimeCounter extends Thread {

  public void timeCount(long startTime) {

    Thread t1 = new Thread(() -> {
      while (!isInterrupted()) {
        try {
          Thread.sleep(1000);
          long currentTime = System.currentTimeMillis();
          long elapsedTime = currentTime - startTime;
          System.out.println("Time elapsed: " + elapsedTime + " milliseconds");
        } catch (InterruptedException e) {
          System.out.println("Exception got " + e);
          Thread.currentThread().interrupt();
        }
      }
    });

    Thread t2 = new Thread(() -> {
      while (!isInterrupted()) {
        try {
          Thread.sleep(5000);
          System.out.println("5 seconds have passed");

        } catch (InterruptedException e) {
          System.out.println("Exception got " + e);
          Thread.currentThread().interrupt();
        }
      }
    });
    t1.start();
    t2.start();
  }

  @Override
  public void run() {
    System.out.println("Time count started... for stop please tape any key and press ENTER");
    final long startTime = System.currentTimeMillis();
    timeCount(startTime);
  }
}
