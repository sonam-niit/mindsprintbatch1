package com.mindsprint.oops.abstraction;

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");
    }
}

public class InterfaceUse {
    public static void main(String[] args) {
        Shape c= new Circle();
        Shape s= new Square();
    }
}
