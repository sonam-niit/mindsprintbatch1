package com.mindsprint.exception;

class NotValidAge extends Exception{
    NotValidAge(String message){
        super(message);
    }
}
public class CustomDemo {
    public static void validate(int age) throws NotValidAge{
        if(age<18){
            throw new NotValidAge("You age is not valid for Vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(10);
        } catch (NotValidAge e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
