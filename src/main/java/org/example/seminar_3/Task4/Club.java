package org.example.seminar_3.Task4;

public class Club<T extends Person> {
    Person[] people;

    Club(Person[] people){
        this.people = people;

    }

    public void haveFun(){
        for (Person p:people) {
            p.haveRest();
        }
    }
}
