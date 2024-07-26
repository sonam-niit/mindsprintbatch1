package com.mindsprint.oops.inherit;

class A{
    A(){
        super();
        System.out.println("A Constructor");
    }
}
class B extends  A{
    B(){
        super();
        System.out.println("B Constructor");
    }
}
class C extends  B{
    C(){
        super();
        System.out.println("C Constructor");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        C c= new C();
    }
}
