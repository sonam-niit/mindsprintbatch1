package com.mindsprint.exception;

public class ThrowDemo {

    public void check(int age) throws Exception{
        if(age>=18){
            System.out.println("Valid");
        }else{
            throw new Exception("Not a valid age");
        }
    }
    public  void print() throws Exception{
        check(17);
    }

    public static void main(String[] args) {
        ThrowDemo obj= new ThrowDemo();
        try {
            obj.print();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
