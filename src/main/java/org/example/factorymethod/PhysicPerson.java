package org.example.factorymethod;

public class PhysicPerson implements Person {

    @Override
    public void greet() {
        System.out.println("greet from physical person");
    }
}
