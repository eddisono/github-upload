package com.company;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(5, Calculator.add(2,3));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(2, Calculator.subtract(3,1));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(10, Calculator.multiply(5, 2));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(10, Calculator.divide(100, 10));
    }
}