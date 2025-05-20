package com.example.actions.calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @DisplayName("Test add two numbers returns correct result")
    @ParameterizedTest
    @CsvSource({"1, 2, 3", "10, -5, 5", "-8, -4, -12", "0, 95, 95", "0, -3, -3", "-3, 0, -3", "10, 0, 10"})
    void addTwoNumbers(int a, int b, int expected) {
        int actual = calculator.addTwoNumbers(a, b);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Test subtract two numbers returns correct result")
    @CsvSource({"10, 5, 5", "-5, 5, -10", "-10, -10, 0", "0, 8, -8", "-9, 0, -9", "0, -10, 10"})
    void subtractTwoNumbers(int a, int b, int expected) {
        int actual = calculator.subtractTwoNumbers(a, b);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Test multiply two numbers returns correct result")
    @CsvSource({"10, 5, 50", "-5, 5, -25", "-10, -10, 100", "0, 8, 0", "-9, 0, 0"})
    void multiplyTwoNumbers(int a, int b, int expected) {
        int actual = calculator.multiplyTwoNumbers(a, b);
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @DisplayName("Test divide two numbers returns correct result")
    @CsvSource({"10, 5, 2", "-50, 5, -10", "-100, -10, 10", "0, 8, 0"})
    void divideTwoNumbers(int a, int b, int expected) {
        int actual = calculator.divideTwoNumbers(a, b);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("Test division by zero throws ArithmeticException")
    void divideByZero() {
        assertThatThrownBy(() -> calculator.divideTwoNumbers(10, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("/ by zero");
    }
}