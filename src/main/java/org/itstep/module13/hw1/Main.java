package org.itstep.module13.hw1;

public class Main {
  public static void main(String[] args) {
    CRUDSender crudSender = new CRUDSender();
    System.out.println("crudSender.deleteUser() = " + crudSender.deleteUser(4));
    System.out.println("crudSender.createUser() = " + crudSender.createUser());
    System.out.println("crudSender.updateUser() = " + crudSender.updateUser(4));
    System.out.println("crudSender.getUsers() = " + crudSender.getUsers());
    System.out.println("crudSender.getUserById() = " + crudSender.getUserById(7));
    System.out.println("crudSender.getUserByUsername() = " + crudSender.getUserByUsername("Antonette"));
    System.out.println("crudSender.getLastCommentsAndWriteToFile() = " + crudSender.getLastCommentsAndWriteToFile(5));
    System.out.println("crudSender.getIncompleteTasks() for user");
    crudSender.getIncompleteTasks(5);
  }
}
