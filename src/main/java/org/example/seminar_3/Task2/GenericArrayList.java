package org.example.seminar_3.Task2;

public class GenericArrayList<T> {
    private Object[] list;
    private int size;

    public GenericArrayList() {
        this.list = new Object[10];
        this.size = 0;
    }

    public void add(T t) {
        if (size == list.length) {
            Object[] newArray = new Object[list.length * 2];
            System.arraycopy(list, 0, newArray, 0, size);
            list = newArray;
        }

        list[size] = t; // Сохраняем переданный элемент
        size++;
    }

    public void remove(T t) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(t)) { // Сравниваем элементы с переданным элементом t
                for (int j = i; j < size - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) list[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}

