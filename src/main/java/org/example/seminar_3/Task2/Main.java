package org.example.seminar_3.Task2;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<String> stringMyArrayList= new GenericArrayList<>();
        stringMyArrayList.add("1");
        stringMyArrayList.add("2");
        stringMyArrayList.add("3");
        System.out.println(stringMyArrayList);
        System.out.println(stringMyArrayList.size());
        System.out.println(stringMyArrayList.get(1));
        stringMyArrayList.clear();
        if (stringMyArrayList.isEmpty()){
            System.out.println("Список пуст");
        }

        GenericArrayList<Integer> myArrayList = new GenericArrayList<>();
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(8);
        System.out.println(myArrayList);


        GenericArrayList<Cat> catMyArrayList = new GenericArrayList<>();
        catMyArrayList.add(new Cat());
        catMyArrayList.add(new Cat());
        catMyArrayList.add(new Cat());
    }
}
