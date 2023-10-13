package org.example.seminar_3.Task3;

public class Main {
    public static void main(String[] args) {

        GenericIterator<Integer> genericIterator = new GenericIterator<>(new Integer[]{1,3,4,});

       while (genericIterator.hasNext()){
           System.out.println(genericIterator.next());
       }

        for (int i:genericIterator) {
            System.out.println(i);
        }
    }
}
