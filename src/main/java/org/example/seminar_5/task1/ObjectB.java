package org.example.seminar_5.task1;

public class ObjectB implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Выполнятся класс В");
    }

    void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }
}
