package org.example.seminar_3.Task3;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenericIterator<T> implements Iterator<T>, Iterable<T> {

    private T[] arr;
    private int index = 0;

    GenericIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("В массиве больше нет элементов");
        }
        T element = arr[index];
        index++;
        return element;

    }

    @Override
    public boolean hasNext() {
        return (index < arr.length);
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericIterator<>(arr);
    }
}
