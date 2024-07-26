package com.mindsprint.oops.basics;

public class Employee {
    int id;
    String name;
    public Employee(){
        this(1,"dummy");
        //calling same class constructor based on parameter
    }
    //refer class level variables
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        this.show();//calling same class method
    }
    public void show(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Employee e1= new Employee();
    }
}
