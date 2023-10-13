package org.example.seminar_3.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GenericClass genericClass = new GenericClass(" ", new InputStream() {
            @Override
            public int read() throws IOException {
                throw new UnsupportedOperationException("dfgdgdfgdf");
            }
        }, 5);

        System.out.println(genericClass);
    }
}
