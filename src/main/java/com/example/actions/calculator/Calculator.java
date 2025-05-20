package com.example.actions.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public int divideTwoNumbers(int a, int b) {
        return a / b;
    }
}
