package com.mindsprint.oops.basics;

public class StaticDemo1 {
    int id;
    String name;
    static String college="XYZ College";

    public StaticDemo1(int id,String name) {
        this.id = id;
        this.name=name;
    }
    public void display(){
        System.out.println("Id: "+id+" Name: "+name);
        System.out.println("College Name "+college);
    }
    public static void getConnection(){
        //DB Connection
        System.out.println("Connection Established");
    }

    public static void main(String[] args) {
        StaticDemo1 s1= new StaticDemo1(1,"Sonam");
        StaticDemo1 s2= new StaticDemo1(2,"Test");
        college="New college";
        s1.display();
        s2.display();
        //call static methods directly by using class name
        StaticDemo1.getConnection();

    }
}
