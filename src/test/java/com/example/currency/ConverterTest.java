package com.example.currency;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testUSDToIDR() {
        Converter converter = new Converter();
        double result = converter.convert("USD", "IDR", 10);
        assertEquals(157000.0, result, 0.001);
    }

    @Test
    public void testIDRToUSD() {
        Converter converter = new Converter();
        double result = converter.convert("IDR", "USD", 15700);
        assertEquals(1.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedConversion() {
        Converter converter = new Converter();
        converter.convert("GBP", "IDR", 10);
    }
}