package com.kodilla;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(23,19);
        int difference = calculator.subtract(77, 15);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

