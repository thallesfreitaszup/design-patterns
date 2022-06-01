package org.example.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        var factory = getFactory("WITH9");
        var number = factory.createNumberSP();

        if (!number.getNumber().startsWith("11")) {
            throw new IllegalStateException("Number of sp should start with 11");
        };
        if (number.getNumber().charAt(2) != '9') {
            throw new IllegalStateException("Number should have 9 after DDD");
        }

        if (number.getNumber().length() != 11) {
            throw new IllegalStateException("Factory with 9 should produce numbers with length of 11");
        }
        factory = getFactory("WITHOUT9");
        number = factory.createNumberDF();
        if (!number.getNumber().startsWith("61")) {
            throw new IllegalStateException("Number of df should start with 61");
        };
        if (number.getNumber().length() != 10) {
            throw new IllegalStateException("Factory without 9 should produce numbers with length of 10");
        }
    }

    private static TelephoneNumberFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "WITH9":
                return new TelephoneNumberFactoryWith9();
            case "WITHOUT9":
                return new TelephoneNumberFactoryWithout9();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
