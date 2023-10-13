package org.example.seminar_3.Task4;

public class Worker implements Person{

    @Override
    public void doWork() {
        System.out.println("Work... ");
    }

    @Override
    public void haveRest() {
        System.out.println("I don't rest ");
    }
}
