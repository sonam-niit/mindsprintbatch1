package com.mindsprint.oops.inherit;

public class Manager extends Employee{
    public Manager(int id, String name, String department, double salary) {
        super(id, name, department, salary);
    }

    public double getBonus(){
        return  salary*0.1;//give 10% of salary as bonus
    }
}
