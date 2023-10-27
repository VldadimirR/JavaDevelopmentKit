package org.example.seminar_5.task1;

public class ObjectA extends Thread{

    @Override
    public void run() {
        System.out.println("Выполнятся класс А");
    }

    void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
}
