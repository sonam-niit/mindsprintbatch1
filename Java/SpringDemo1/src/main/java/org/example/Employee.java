package org.example;

public class Employee {
    private int id;
    private String name;

    public Employee(){}
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
