package org.example.seminar_3.Homework.Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseManager<String> stringDatabase = new DatabaseManager<>(new ArrayList<>());

        stringDatabase.save("Data 1");
        stringDatabase.save("Data 2");
        stringDatabase.save("Data 3");

        String data = stringDatabase.retrieveById(1);
        System.out.println("Retrieved data: " + data);

        stringDatabase.delete("Data 2");

        List<String> allData = stringDatabase.retrieveAll();
        System.out.println("All data: " + allData);
    }
}
