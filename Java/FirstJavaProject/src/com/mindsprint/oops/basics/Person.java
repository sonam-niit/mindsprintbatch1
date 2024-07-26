package com.mindsprint.oops.basics;

import java.util.Scanner;

public class Person {
    int id;
    String name;
    public Person(){
        id=1;
        name="dummy user";
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1= new Person();
        Person p2= new Person(45,"Sonam Soni");
        System.out.println("Id: "+p1.id+", Name: "+p1.name);
        System.out.println("Id: "+p2.id+", Name: "+p2.name);
    }
}
