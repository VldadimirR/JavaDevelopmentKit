package org.example.seminar_3.Homework.Task2;

public class Calculator {

    public <T extends Number> double sum( T numb1, T numb2 ){
        return numb1.doubleValue() + numb2.doubleValue();
    }
    public <T extends Number> double multiply( T numb1, T numb2 ) {
        return numb1.doubleValue() * numb2.doubleValue();
    }
    public <T extends Number> double divide( T numb1, T numb2 ){
        if (numb2.doubleValue() == 0){
            throw new ArithmeticException("Деление на ноль");
        } else {
            return numb1.doubleValue() / numb2.doubleValue();
        }
    }
    public <T extends Number> double subtract( T numb1, T numb2 ){
        return numb1.doubleValue() - numb2.doubleValue();
    }
}
