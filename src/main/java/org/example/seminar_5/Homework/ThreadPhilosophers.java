package org.example.seminar_5.Homework;

import java.util.concurrent.Semaphore;

public class ThreadPhilosophers {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Semaphore[] flag = new Semaphore[NUM_PHILOSOPHERS];
    private static final Semaphore maxDiners = new Semaphore(NUM_PHILOSOPHERS - 1);

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            flag[i] = new Semaphore(1);
        }

        Thread philosopher = new Thread(() -> {
            int philosopherNumber = 1;
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Философ 1 обедает");
                    Thread.sleep(600);

                    flag[philosopherNumber - 1].release();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].release();
                    maxDiners.release();

                    System.out.println("Философ 1 размышляет");
                    Thread.sleep(500);

                    maxDiners.acquire();
                    flag[philosopherNumber - 1].acquire();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].acquire();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Философ 1 размышляет");
        });

        Thread philosopherTwo = new Thread(() -> {
            int philosopherNumber = 2;
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Философ 2 размышляет");
                    Thread.sleep(600);

                    maxDiners.acquire();
                    flag[philosopherNumber - 1].acquire();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].acquire();


                    System.out.println("Философ 2 обедает");
                    Thread.sleep(500);

                    flag[philosopherNumber - 1].release();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].release();
                    maxDiners.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Философ 2 размышляет");

        });
        Thread philosopherThree = new Thread(() -> {
            int philosopherNumber = 3;
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Философ 3 размышляет");
                    Thread.sleep(300);

                    maxDiners.acquire();
                    flag[philosopherNumber - 1].acquire();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].acquire();


                    System.out.println("Философ 3 обедает");
                    Thread.sleep(500);

                    flag[philosopherNumber - 1].release();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].release();
                    maxDiners.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Философ 3 размышляет");
        });
        Thread philosopherFoo = new Thread(() -> {
            int philosopherNumber = 4;
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Философ 4 размышляет");
                    Thread.sleep(600);

                    maxDiners.acquire();
                    flag[philosopherNumber - 1].acquire();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].acquire();


                    System.out.println("Философ 4 обедает");
                    Thread.sleep(500);

                    flag[philosopherNumber - 1].release();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].release();
                    maxDiners.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Философ 4 размышляет");
        });
        Thread philosopherFive = new Thread(() -> {
            int philosopherNumber = 5;
            for (int i = 0; i < 3; i++) {
                try {
                    System.out.println("Философ 5 размышляет");
                    Thread.sleep(600);

                    maxDiners.acquire();
                    flag[philosopherNumber - 1].acquire();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].acquire();


                    System.out.println("Философ 5 обедает");
                    Thread.sleep(500);

                    flag[philosopherNumber - 1].release();
                    flag[philosopherNumber % NUM_PHILOSOPHERS].release();
                    maxDiners.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Философ 5 размышляет");
        });

        philosopher.start();
        philosopherTwo.start();
        philosopherThree.start();
        philosopherFoo.start();
        philosopherFive.start();
    }
}
