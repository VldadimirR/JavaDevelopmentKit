package org.example.seminar_3.Task4;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Slacker idler1 = new Slacker();
        Slacker idler2 = new Slacker();

        Person[] workers = {worker1, worker2, idler1, idler2};
        Person[] idlers = {idler1, idler2, worker1, worker2};

        Workplace<Worker> workplace = new Workplace<>(workers);
        Club<Slacker> club = new Club<>(idlers);

        System.out.println("На работе:");
        workplace.doWork();

        System.out.println("В клубе:");
        club.haveFun();

    }
}
