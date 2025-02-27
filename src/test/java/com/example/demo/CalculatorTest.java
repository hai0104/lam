package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void add_TuongDuong() {
        Calculator cong = new Calculator();
        int result = cong.add(2, 3);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void add_Bien() {
        Calculator cong = new Calculator();
        int result = cong.add(2, 1);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void subtract_TuongDuong() {
        Calculator tru = new Calculator();
        int result = tru.subtract(2, 1);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void subtract_Bien() {
        Calculator cong = new Calculator();
        int result = cong.subtract(2, 1);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void multiply_TuongDuong() {
        Calculator tru = new Calculator();
        int result = tru.multiply(2, 2);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void multiply_Bien() {
        Calculator cong = new Calculator();
        int result = cong.multiply(2, 1);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void divide_Bien() {
        Calculator cong = new Calculator();
        double result = cong.divide(2, 1);
        double expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void divide_so0() {
        Calculator cong = new Calculator();
        double result = cong.divide(0, 1);
        double expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void divide_cho_0() {
        //      cach 1
//        Calculator cong = new Calculator();
//        Exception exception=assertThrows(IllegalArgumentException.class,()-> Calculator.divide(6 ,0));
//        String expected="Khong the chia cho 0";
//        String actual=exception.getMessage();
//        assertTrue(actual.contains(expected));

        //cach 2
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(6, 0));
        assertEquals("Khong the chia cho 0", exception.getMessage());
    }

    @Test
    public void divide_SoAm() {
        Calculator cong = new Calculator();
        double result = cong.divide(-6, 2);
        double expected = -3;
        assertEquals(expected, result);
    }

    @Test
    public void divide_TuongDuong() {
        Calculator tru = new Calculator();
        double result = tru.divide(6, 3);
        double expected = 2;
        assertEquals(expected, result);
    }
}