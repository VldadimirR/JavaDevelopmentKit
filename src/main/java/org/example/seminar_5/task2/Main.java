package org.example.seminar_5.task2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
        public static void main(String[] args) {
            AtomicBoolean switcher = new AtomicBoolean(true);
            AtomicInteger a = new AtomicInteger(100);
            Object x = new Object();


            Thread threadA = new Thread(() -> {
                while (a.get() > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    switcher.set(!switcher.get());
                }
            });
            Thread threadB = new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                while (a.get() > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (switcher.get()) {
                        System.out.println(a);
                        a.set(a.get() - 1);
                    }
                }
            });

            threadA.start();
            threadB.start();
        }
}
