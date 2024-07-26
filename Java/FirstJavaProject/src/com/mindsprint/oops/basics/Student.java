package com.mindsprint.oops.basics;

public class Student {
    int id;
    String name;
    String address;

    void setData(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }

    public static void main(String[] args) {
        Student stu1= new Student();Student stu2= new Student();
        stu1.setData(1,"alex","mumbai");
        stu2.setData(2,"bob","US");
        stu1.display();
        stu2.display();
    }
}
