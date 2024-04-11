package bank;

import java.lang.StringBuilder;
public class Card {
    private final String CARD_NUMBER;

    private String pinCode;

    public Card() {
        this.CARD_NUMBER = generateNumbers(16);
        this.pinCode = generateNumbers(4);
    }

    private String generateNumbers(int amount) {
        StringBuilder builder = new StringBuilder();

        for (int i=0; i < amount; i++) {
            builder.append(rnd(0,9));
        }
        return builder.toString();
    }

    private int rnd(int min, int max) {

        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public String getPinCode() {
        return pinCode;
    }
}
