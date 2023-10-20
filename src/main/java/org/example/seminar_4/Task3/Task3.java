package org.example.seminar_4.Task3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        // Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
        Map<String, String> phoneNumber = new HashMap<>(
                Map.of(
                    "9193457656", "СерхиоБускетс",
                    "89191996767", "Мария",
                    "09192345627","Иван",
                    "59191976767", "Антонио"
                ));

        // Найдите человека с самым маленьким номером телефона
        var min = phoneNumber.entrySet().stream()
                .min(Map.Entry.comparingByKey()).get();
        System.out.println(min.getValue());

        // Найдите номер телефона человека чье имя самое большое в алфавитном порядке
        var max = phoneNumber.entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue().length())).get();
        System.out.println(max.getValue());
    }


}
