package org.example.seminar_3.Homework.Task2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int intNum1 = 2;
        long longNum2 = 4;

        double doubleNum1 = 7.5;
        float floatNum2 = 2.5F;


        System.out.println("Сумма: " + calculator.sum(intNum1, longNum2));
        System.out.println("Умножение: " + calculator.multiply(doubleNum1, floatNum2));
        System.out.println("Деление: " + calculator.divide(doubleNum1, floatNum2));
        System.out.println("Вычитание: " + calculator.subtract(intNum1, longNum2));
        System.out.println("Вычитание: " + calculator.subtract(longNum2, floatNum2));
    }
}
