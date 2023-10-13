package org.example.seminar_3.Homework.Task1;

import org.example.seminar_3.Task2.Cat;

public class Main {
    public static void main(String[] args) {
        GenericArrayAndIterator<String> stringMyArrayList= new GenericArrayAndIterator<>();
        stringMyArrayList.add("1");
        stringMyArrayList.add("2");
        stringMyArrayList.add("3");
        for (String str : stringMyArrayList) {
            System.out.println(str);
        }
        System.out.println(stringMyArrayList.size());
        System.out.println(stringMyArrayList.get(1));
        stringMyArrayList.clear();
        if (stringMyArrayList.isEmpty()){
            System.out.println("Список пуст");
        }

        GenericArrayAndIterator<Integer> myArrayList = new GenericArrayAndIterator<>();
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(8);
        for (Integer element : myArrayList) {
            System.out.println(element);
        }


        GenericArrayAndIterator<Cat> catMyArrayList = new GenericArrayAndIterator<>();
        catMyArrayList.add(new Cat());
        catMyArrayList.add(new Cat());
        catMyArrayList.add(new Cat());
        for (Cat cat : catMyArrayList) {
            System.out.println(cat);
        }
    }
}
