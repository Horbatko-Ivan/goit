package org.itstep.module9.hw1stack;

public class Main {
  public static void main(String[] args) {
    LinkedStack<Integer> linkedStack = new LinkedStack<>();
    linkedStack.push(10);
    linkedStack.push(20);
    linkedStack.push(30);
    linkedStack.push(40);
    linkedStack.push(50);
    System.out.println("linkedStack " + linkedStack);
    System.out.println("linkedStack size is " + linkedStack.size());
    System.out.println("linkedStack  is Empty " + linkedStack.isEmpty() + " //false");
    System.out.println("linkedStack Peek first " + linkedStack.peek());
    System.out.println("linkedStack size is " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    System.out.println("linkedStack pop " + linkedStack.pop() + " get size " + linkedStack.size());
    linkedStack.push(10);
    linkedStack.push(20);
    linkedStack.push(30);
    linkedStack.push(40);
    linkedStack.push(50);
    System.out.println("linkedStack size is " + linkedStack.size());
    linkedStack.remove(3);
    System.out.println("linkedStack remove 3rd el " + linkedStack + "linkedStack size " + linkedStack.size());
    linkedStack.clear();
    System.out.println("linkedStack size " + linkedStack.size());
    System.out.println("linkedStack " + linkedStack);
  }
}
