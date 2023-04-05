package org.itstep.module9.hw1queue;

public class Main {
  public static void main(String[] args) {
    LinkedQueue<String> linkedQueue = new LinkedQueue<>();
    linkedQueue.add("1");
    linkedQueue.add("2");
    linkedQueue.add("3");
    linkedQueue.add("4");
    linkedQueue.add("5");
    System.out.println("linkedQueue size is " + linkedQueue.size());
    System.out.println("linkedQueue  is Empty " + linkedQueue.isEmpty() + " //false");
    System.out.println("linkedQueue Peek first " + linkedQueue.peek());
    System.out.println("linkedQueue size is " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    System.out.println("linkedQueue poll " + linkedQueue.poll() + " get size " + linkedQueue.size());
    linkedQueue.add("1");
    linkedQueue.add("2");
    linkedQueue.add("3");
    linkedQueue.add("4");
    linkedQueue.add("5");
    System.out.println("linkedQueue size is " + linkedQueue.size());
    linkedQueue.clear();
    System.out.println("linkedQueue clear " + linkedQueue.size());
  }
}
