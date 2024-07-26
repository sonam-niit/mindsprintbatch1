package com.mindsprint.oops.abstraction;

public class ImplClass extends Demo{
    public ImplClass(int id) {
        super(id);
    }
    @Override
    public void myDream() {
        System.out.println("My Dream Implemented");
    }

    public static void main(String[] args) {
        ImplClass obj= new ImplClass(5);
        obj.myDream();
    }
}
