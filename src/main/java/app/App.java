package app;

import bank.Client;

public class App {
    public static void main(String[] args) {
        Client user = new Client("Vasya", "Pupkin");
        System.out.println(user.getCard().getCARD_NUMBER());
        System.out.println(user.getCard().getPinCode());
    }
}
