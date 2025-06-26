package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(9, 5));
    }

    @Test
    public void testIsEven() {
        Calculator calc = new Calculator();
        assertTrue(calc.isEven(8));
        assertFalse(calc.isEven(7));
    }
}
