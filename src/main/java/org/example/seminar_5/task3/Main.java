package org.example.seminar_5.task3;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger runnerA = new AtomicInteger(); // 0 - не готов, 1 - готов, 2 - бежит, 3 - прибежал
    static AtomicInteger runnerB = new AtomicInteger();
    static AtomicInteger runnerC = new AtomicInteger();
    static Random rand = new Random();

    public static void main(String[] args) {
        runnerB.set(0);
        runnerA.set(0);
        runnerC.set(0);

        Thread runA = new Thread(() -> {
            try {
                System.out.println(System.nanoTime() + "Бегун 1 начал подготовку");
                Thread.sleep(rand.nextInt(4000));
                runnerA.set(1);
                System.out.println(System.nanoTime() + "Бегун 1 готов!");
                while (runnerA.get() != 2) {
                    Thread.sleep(2);
                }
                Thread.sleep(rand.nextInt(5000));
                runnerA.set(3);
                System.out.println(System.nanoTime() + "Бегун 1 финишировал");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread runB = new Thread(() -> {
            try {
                System.out.println(System.nanoTime() + "Бегун 2 начал подготовку");
                Thread.sleep(rand.nextInt(4000));
                runnerB.set(1);
                System.out.println(System.nanoTime() + "Бегун 2 готов!");
                while (runnerB.get() != 2) {
                    Thread.sleep(2);
                }
                Thread.sleep(rand.nextInt(5000));
                runnerB.set(3);
                System.out.println(System.nanoTime() + "Бегун 2 финишировал");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread runC = new Thread(() -> {
            try {
                System.out.println(System.nanoTime() + "Бегун 3 начал подготовку");
                Thread.sleep(rand.nextInt(4000));
                runnerC.set(1);
                System.out.println(System.nanoTime() + "Бегун 3 готов!");
                while (runnerC.get() != 2) {
                    Thread.sleep(2);
                }
                Thread.sleep(rand.nextInt(5000));
                runnerC.set(3);
                System.out.println(System.nanoTime() + "Бегун 3 финишировал");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread judge = new Thread(() -> {
            while (!(runnerA.get() == 3 && runnerB.get() == 3 && runnerC.get() == 3)) {
                if (runnerA.get() == 1 && runnerB.get() == 1 && runnerC.get() == 1) {
                    try {
                        Thread.sleep(500);
                        System.out.println("На старт");
                        Thread.sleep(500);
                        System.out.println("Внимание!");
                        Thread.sleep(500);
                        System.out.println("Марш!!!");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    runnerA.set(2);
                    runnerB.set(2);
                    runnerC.set(2);

                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Гонка завершена!");
        });

        runA.start();
        runB.start();
        runC.start();
        judge.start();

    }
}
