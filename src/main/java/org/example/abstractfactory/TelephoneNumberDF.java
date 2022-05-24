package org.example.abstractfactory;

public  class TelephoneNumberDF implements TelephoneNumber {
    private final String value;

    public TelephoneNumberDF(String number) {
        this.DDD = 61;
        this.value = number;
    }
    private int DDD;

    @Override
    public String getNumber() {
        return this.DDD+value;
    }
}
