package com.mindsprint.oops.polymorph;

class Parent{
    public void show(){
        System.out.println("Parent Class Show Method");
    }
}
class Child extends  Parent{
    public void show(){
        System.out.println("Child Class Show Method");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {
        Child c= new Child();
//        Parent c= new Child();
        c.show(); //it calls Child method
    }
}
