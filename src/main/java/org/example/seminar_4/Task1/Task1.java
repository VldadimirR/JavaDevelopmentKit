package org.example.seminar_4.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Создайте коллекцию мужских и женских имен с помощью интерфейса List
        List<String> names = new ArrayList<>(List.of("Bob","Anna","Evgeni","Pavel","Vladimir"));

        // Сортировка по первой букве
        Collections.sort(names);
        System.out.println(names);

        // Разворот списка
        Collections.reverse(names);
        System.out.println(names);

        // Сортировка по длине символов
        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);


    }
}
