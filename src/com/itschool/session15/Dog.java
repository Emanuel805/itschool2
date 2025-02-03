package com.itschool.session15;

public class Dog extends Animal {

    /**The issue arises because the Dog class is inheriting from the abstract class Animal,
     which has two abstract methods: cats and dogs. When a class inherits from an abstract class,
     it must provide implementations for all the abstract methods in the parent class.

     Cat class must implement both methods, even if the cats method is not relevant to the Cat class.
     If you try to create a Dog class with only the cats method,
     the compiler will throw an error because the dogs method is not implemented.
     */
    public void dogs() {
        System.out.println("Dogs bark");
    }
}
