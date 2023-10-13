package org.example.seminar_3.Homework.Task3;

public class Main {
    public static void main(String[] args) {
        ArrayLengthComparison comparison = new ArrayLengthComparison();

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        boolean result1 = comparison.compareArrays(arr1, arr2, true);
        System.out.println("Тест 1 (Сравнение массивов одинаковой длины и типов): " + result1);

        String[] arr3 = {"apple", "banana"};
        String[] arr4 = {"cherry", "date", "fig"};
        boolean result2 = comparison.compareArrays(arr3, arr4, true);
        System.out.println("Тест 2 (Сравнение массивов разной длины и типов): " + result2);

        Integer[] arr5 = {1, 2, 3};
        String[] arr6 = {"apple", "banana", "cherry"};
        boolean result3 = comparison.compareArrays(arr5, arr6, false);
        System.out.println("Тест 3 (Сравнение массивов разной длины без проверки типов): " + result3);

        Integer[] arr7 = {};
        String[] arr8 = {};
        boolean result4 = comparison.compareArrays(arr7, arr8, true);
        System.out.println("Тест 4 (Сравнение пустых массивов): " + result4);

        Integer[] arr9 = {1, 2, 3};
        Object[] arr10 = {"apple", 2, "cherry"};
        boolean result5 = comparison.compareArrays(arr9, arr10, true);
        System.out.println("Тест 5 (Сравнение массивов разных типов в одном из них): " + result5);
    }
}
