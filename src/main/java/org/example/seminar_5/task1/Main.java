package org.example.seminar_5.task1;

public class Main {
    public static void main(String[] args) {
        ObjectA obA = new ObjectA();
        ObjectB obB = new ObjectB();

        Thread threadA = new Thread(() -> {
            synchronized (obA) {
                System.out.println("DeadThreadOne is holding LOCK 1...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadOne is waiting for Lock 2...");
                synchronized (ObjectB.class) {
                    System.out.println("DeadThreadOne  is holding Lock 1 and Lock 2...");
                }
            }

        });


        Thread threadB = new Thread(() -> {
            synchronized (ObjectB.class) {
                System.out.println("DeadThreadTwo is holding LOCK 2...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("DeadThreadTwo is waiting for Lock 1...");
                synchronized (obA) {
                    System.out.println("DeadThreadTwo  is holding Lock 1 and Lock 2...");
                }
            }


        });

        threadA.start();
        threadB.start();


    }


}
