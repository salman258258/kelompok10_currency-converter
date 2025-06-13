package com.example.currency;

public class App {
    public static void main(String[] args) {
        Converter converter = new Converter();
        double result = converter.convert("USD", "IDR", 10);
        System.out.println("10 USD in IDR: " + result);
    }
}
