package org.example.seminar_3.Task4;

public class Slacker implements Person {
    @Override
    public void doWork() {
        System.out.println("I don't work ");
    }

    @Override
    public void haveRest() {
        System.out.println("Rest... ");
    }
}
