package com.mindsprint.oops.inherit;

public class Main {
    public static void main(String[] args) {

        Developer d1=new Developer(1,"Alex","R&D",456788,"JAVA");
        Manager m1= new Manager(2,"Bob","Finance",87652);
        d1.display();
        m1.display();
        System.out.println("Balance Developer: "+d1.getBonus());
        System.out.println("Balance Manager: "+m1.getBonus());

    }
}
