package org.example.seminar_3.Task1;

import java.io.InputStream;
import java.io.Serializable;


public class GenericClass <T extends Comparable, V extends InputStream & Serializable, K extends Number> {
    private T t;
    private  V v;
    private  K k;

    GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t.getClass().getName() +
                ", v=" + v.getClass().getName() +
                ", k=" + k.getClass().getName() +
                '}';
    }
}
