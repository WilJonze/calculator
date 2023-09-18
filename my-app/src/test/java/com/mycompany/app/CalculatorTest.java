package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        assertEquals(
            "Correct sum when numbers are added",
            calculator.add(6,2), 8);
    }

    @Test
    public void testSubtraction() {
        assertEquals(
            "Correct sum when numbers are subtracted",
            calculator.subtract(6,2),4);
    }

    @Test
    public void testMultiply() {
        assertEquals(
            "Correct sum when numbers multiply",
            calculator.multiply(6,2), 12);
    }

    @Test
    public void testDivision() {
        assertEquals(
            "Correct sum when numbers divide",
            calculator.divide(6,2), 3);
    }

    @Test
    public void testDivisionByZero() {
        try {
            int result = calculator.divide(10,0);
            fail("Expected ArithmeticException but got result: " + result);
        } catch (ArithmeticException x) {
            assertEquals("Division by zero is not allowed", x.getMessage());
        }
    }

 
}
