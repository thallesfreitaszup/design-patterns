package org.example.factorymethod;

public class JuridicPerson implements Person {
    @Override
    public void greet() {
        System.out.println("Greet from juridic person");
    }
}
