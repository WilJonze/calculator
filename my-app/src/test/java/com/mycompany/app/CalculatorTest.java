package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        assertEquals(
            "Correct sum when numbers multiply",
            calculator.multiply(4,5), 20);
    }
}
