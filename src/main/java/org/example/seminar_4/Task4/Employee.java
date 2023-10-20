package org.example.seminar_4.Task4;

public class Employee {

    private long tableNumber;
    private String phoneNumber;
    private String name;
    private int seniority;

    public Employee(long tableNumber, String phoneNumber, String name, int seniority) {
        this.tableNumber = tableNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.seniority = seniority;
    }

    public long getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(long tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tableNumber=" + tableNumber +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", seniority=" + seniority +
                '}';
    }
}
