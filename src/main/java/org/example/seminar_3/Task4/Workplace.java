package org.example.seminar_3.Task4;

public class Workplace<T extends Person> {

    Person[] people;

    Workplace(Person[] people){
        this.people = people;

    }

    public void doWork(){
        for (Person p:people) {
            p.doWork();
        }
    }
}
