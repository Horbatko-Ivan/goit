package org.itstep.module9.hw1hashmap;

public class Main {
  public static void main(String[] args) {
    MyHashMap<String, String> myHashMap = new MyHashMap<>();
    myHashMap.put("1", "1");
    System.out.println(myHashMap.size());
    myHashMap.put("2", "2");
    System.out.println(myHashMap.size());
    myHashMap.put("3", "3");
    System.out.println(myHashMap.size());
    myHashMap.put("4", "4");
    System.out.println(myHashMap.size());
    myHashMap.put("0", "5");
    System.out.println(myHashMap.size());
    myHashMap.put("0", "4");
    System.out.println(myHashMap.size());
    myHashMap.put("A", "C");
    System.out.println(myHashMap.size());
    myHashMap.put("B", "D");
    System.out.println(myHashMap.size());
    System.out.println(myHashMap);

    myHashMap.remove("A");
    System.out.println(myHashMap.size());
    System.out.println(myHashMap);

    myHashMap.remove("4");
    System.out.println(myHashMap.size());
    System.out.println(myHashMap);

    myHashMap.clear();
    System.out.println(myHashMap.size());
    System.out.println("after clear myHashMap is " + myHashMap);
  }
}
