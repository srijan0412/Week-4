package org.day5.JUnit.BasicProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(10, Calculator.add(5, 5));
        assertEquals(-12, Calculator.add(-6, -6));
        assertEquals(10, Calculator.add(20, -10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, Calculator.multiply(4, 3));
        assertEquals(12, Calculator.multiply(-4, -3));
        assertEquals(-12, Calculator.multiply(-4, 3));
        assertEquals(-12, Calculator.multiply(4, -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(17, Calculator.subtract(20, 3));
        assertEquals(17, Calculator.subtract(7, -10));
        assertEquals(5, Calculator.subtract(-10, -15));
        assertEquals(-10, Calculator.subtract(-7, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(5, Calculator.divide(10, 2));
        assertEquals(27, Calculator.divide(81, 3));
        try {
            assertEquals(0, Calculator.divide(10, 0));
        }
        catch (ArithmeticException e) {
            System.out.print("Cannot divide with zero.");
        }

    }

}
