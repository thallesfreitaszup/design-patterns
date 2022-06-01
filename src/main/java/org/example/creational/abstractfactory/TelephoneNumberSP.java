package org.example.creational.abstractfactory;

public  class TelephoneNumberSP implements TelephoneNumber {
    private final String value;

    public TelephoneNumberSP(String number) {
        this.DDD = 11;
        this.value = number;
    }
    private int DDD;

    @Override
    public String getNumber() {
        return this.DDD+value;
    }
}
