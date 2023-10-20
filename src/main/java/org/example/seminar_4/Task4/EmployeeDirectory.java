package org.example.seminar_4.Task4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    // Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> findBySeniority(int seniority){
        if (seniority < 0) {
            throw new IllegalArgumentException("Стаж не может быть отрицательным");
        }
        List<Employee> resultEmployee = new ArrayList<>();
        for (Employee employee:employeeList) {
            if (employee.getSeniority() == seniority){
                resultEmployee.add(employee);
            }
        }
        return resultEmployee;
    }

    // Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public List<String> findNumberPhone(String name){
        if (name == null) {
            throw new IllegalArgumentException("Имя не может быть null");
        }
        List<String> resultEmployee = new ArrayList<>();
        for (Employee employee:employeeList) {
            if (employee.getName().equals(name)){
                resultEmployee.add(employee.getPhoneNumber());
            }
        }
        return resultEmployee;
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public Employee findByTableNumber(long tableNumber){
        if (tableNumber < 0) {
            throw new IllegalArgumentException("Табельный номер не может быть отрицательным");
        }
        for (Employee employee:employeeList) {
            if (employee.getTableNumber() == tableNumber){
                return employee;
            }
        }
        return null;
    }

    // Добавить метод добавление нового сотрудника в справочник сотрудников
    public void addEmployee(Employee employee){
        if (employee != null) {
            employeeList.add(employee);
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
