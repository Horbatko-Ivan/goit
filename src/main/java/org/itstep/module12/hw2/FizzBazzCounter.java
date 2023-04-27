package org.itstep.module12.hw2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class FizzBazzCounter extends Thread {
  private static final String MESSAGE = "Exception got ";
  private final BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
  private final AtomicInteger numberToCheck = new AtomicInteger(1);

  @SuppressWarnings("InfiniteLoopStatement")
  private void fizz() throws InterruptedException {
    while (true) {
      synchronized (blockingQueue) {
        if (numberToCheck.get() % 3 == 0 && numberToCheck.get() % 5 != 0) {
          blockingQueue.add("fizz");
          numberToCheck.incrementAndGet();
          blockingQueue.notifyAll();
        } else {
          try {
            blockingQueue.wait();
          } catch (InterruptedException e) {
            System.out.println(MESSAGE + e);
            Thread.currentThread().interrupt();
          }
        }
      }
      Thread.sleep(100);
    }
  }

  @SuppressWarnings("InfiniteLoopStatement")
  private void buzz() throws InterruptedException {
    while (true) {
      synchronized (blockingQueue) {
        if (numberToCheck.get() % 3 != 0 && numberToCheck.get() % 5 == 0) {
          blockingQueue.add("buzz");
          numberToCheck.incrementAndGet();
          blockingQueue.notifyAll();
        } else {
          try {
            blockingQueue.wait();
          } catch (InterruptedException e) {
            System.out.println(MESSAGE + e);
            Thread.currentThread().interrupt();
          }
        }
      }
      Thread.sleep(100);
    }
  }

  @SuppressWarnings("InfiniteLoopStatement")
  private void fizzbuzz() throws InterruptedException {
    while (true) {
      synchronized (blockingQueue) {
        if (numberToCheck.get() % 3 == 0 && numberToCheck.get() % 5 == 0) {
          blockingQueue.add("fizzbuzz");
          numberToCheck.incrementAndGet();
          blockingQueue.notifyAll();
        } else {
          try {
            blockingQueue.wait();
          } catch (InterruptedException e) {
            System.out.println(MESSAGE + e);
            Thread.currentThread().interrupt();
          }
        }
      }
      Thread.sleep(100);
    }
  }

  @SuppressWarnings("InfiniteLoopStatement")
  private void number() throws InterruptedException {
    while (true) {
      synchronized (blockingQueue) {
        if (numberToCheck.get() % 3 != 0
          && numberToCheck.get() % 5 != 0) {
          blockingQueue.add(String.valueOf(numberToCheck.get()));
          numberToCheck.incrementAndGet();
          blockingQueue.notifyAll();
        } else {
          try {
            blockingQueue.wait();
          } catch (InterruptedException e) {
            System.out.println(MESSAGE + e);
            Thread.currentThread().interrupt();
          }
        }

        while (!blockingQueue.isEmpty()) {
          System.out.print(blockingQueue.poll() + ", ");
        }
      }
      Thread.sleep(100);
    }
  }

  private void fizzBuzzWriter() {
    Thread threadA = new Thread(() -> {
      try {
        fizz();
      } catch (InterruptedException e) {
        System.out.println(MESSAGE + e);
        Thread.currentThread().interrupt();
      }
    });

    Thread threadB = new Thread(() -> {
      try {
        buzz();
      } catch (InterruptedException e) {
        System.out.println(MESSAGE + e);
        Thread.currentThread().interrupt();
      }
    });
    Thread threadC = new Thread(() -> {
      try {
        fizzbuzz();
      } catch (InterruptedException e) {
        System.out.println(MESSAGE + e);
        Thread.currentThread().interrupt();
      }
    });
    Thread threadD = new Thread(() -> {
      try {
        number();
      } catch (InterruptedException e) {
        System.out.println(MESSAGE + e);
        Thread.currentThread().interrupt();
      }
    });
    threadA.start();
    threadB.start();
    threadC.start();
    threadD.start();
  }

  @Override
  public void run() {
    fizzBuzzWriter();
  }
}
