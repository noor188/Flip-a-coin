package ui;

import model.Coin;

public class Main {
    public static void main(String[] args) {

        Coin coin = new Coin();

        //combination #1
        coin.flip();
        coin.checkStatus();

        //combination #2
        coin.flip();
        coin.checkStatus();
        coin.flip();
        coin.checkStatus();

        //combination #3
        coin.checkStatus();
        coin.flip();

    }
}
