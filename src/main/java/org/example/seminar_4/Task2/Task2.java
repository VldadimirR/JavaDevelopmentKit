package org.example.seminar_4.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        // Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
        List<String> names = new ArrayList<>(List.of("Bob","Anna", "Bob","Evgeni","Pavel","Vladimir","Pavel"));

        // Получите уникальный список Set на основании List
        Set<String> setNames = new HashSet<>(names);
        System.out.println(setNames);

        // Определите наименьший элемент (алфавитный порядок)
        System.out.println(Collections.min(setNames));

        // Определите наибольший элемент (по количеству букв в слове)
        System.out.println(Collections.max(setNames, Comparator.comparingInt(String::length)));

        //Удалите все элементы содержащие букву ‘A’
        setNames.removeIf(s -> s.contains("a") || s.contains("A"));
        System.out.println(setNames);
    }
}
