package org.example.factorymethod;

public class FactoryMethod {

    public Person create(PersonType personType) {
        switch (personType) {
            case CNPJ:
                return new JuridicPerson();
            case CPF:
                return new PhysicPerson();
            default:
                throw new IllegalArgumentException("Person type not supported");
        }
    }
}
