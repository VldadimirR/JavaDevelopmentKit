package org.example.seminar_3.Homework.Task5;

import java.util.List;

public class DatabaseManager<T> implements DatabaseOperations<T> {
    private List<T> database;

    public DatabaseManager(List<T> database) {
        this.database = database;
    }

    @Override
    public void save(T data) {
        database.add(data);
    }

    @Override
    public void delete(T data) {
        database.remove(data);
    }

    @Override
    public T retrieveById(int id) {
        if (id >= 0 && id < database.size()) {
            return database.get(id);
        }
        return null;
    }

    @Override
    public List<T> retrieveAll() {
        return database;
    }


}
