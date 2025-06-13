package com.example.currency;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private final Map<String, Double> rates = new HashMap<>();

    public Converter() {
        rates.put("USD_IDR", 15700.0);
        rates.put("EUR_IDR", 17000.0);
        rates.put("IDR_USD", 1/15700.0);
        rates.put("IDR_EUR", 1/17000.0);
    }

    public double convert(String from, String to, double amount) {
        String key = from + "_" + to;
        if (rates.containsKey(key)) {
            return amount * rates.get(key);
        } else {
            throw new IllegalArgumentException("Conversion rate not found for: " + key);
        }
    }
}