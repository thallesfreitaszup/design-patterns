package org.example.abstractfactory;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TelephoneNumberFactoryWith9 implements TelephoneNumberFactory {

    @Override
    public TelephoneNumber createNumberSP() {
        return new TelephoneNumberSP(generateNumber());
    }

    private String generateNumber() {
        var preFix = '9';
        char[] chars = new char[] { '0','1','2','3','4','5','6','7','8','9'};
        var numberString = new StringBuilder();
        numberString.append(preFix);
        var sizeNumber = 8;
        for(int i =0; i < sizeNumber; i++) {
            var numberIndex = ThreadLocalRandom.current().nextInt(0, sizeNumber);
            numberString.append(chars[numberIndex]);
        }
        return numberString.toString();
    }

    @Override
    public TelephoneNumber createNumberDF() {
        return new TelephoneNumberDF(generateNumber());
    }
}
