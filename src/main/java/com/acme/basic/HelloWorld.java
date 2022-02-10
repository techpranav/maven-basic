package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    if(true && false || false || true && true)
      System.out.println("Hello World boolean!");
      
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

}
