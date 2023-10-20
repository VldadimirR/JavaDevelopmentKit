package org.example.seminar_4.Task4;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(456464556, "1234567890", "John", 11);
        Employee employee2 = new Employee(947546456, "9876548210", "Alice", 24);

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        try {
            employeeDirectory.addEmployee(employee1);
            employeeDirectory.addEmployee(employee2);
            System.out.println("New employee added: " + employee1.getName());
            System.out.println("New employee added: " + employee2.getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }

        try {
            System.out.println("Employees with seniority: " +
                    employeeDirectory.findBySeniority(11));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }

        try {
            System.out.println("Phone numbers of employees named: " +
                    employeeDirectory.findNumberPhone("Alice"));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }

        try {
            Employee employee = employeeDirectory.findByTableNumber(456464556);
            if (employee != null) {
                System.out.println("Employee with table number: " + employee.getName());
            } else {
                System.out.println("Employee not found.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: " + e.getMessage());
        }
    }
}
