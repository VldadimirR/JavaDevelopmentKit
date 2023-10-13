package org.example.seminar_3.Homework.Task5;

import java.util.List;

public interface DatabaseOperations<T> {

    void save(T data);

    void delete(T data);

    T retrieveById(int id);

    List<T> retrieveAll();

}
