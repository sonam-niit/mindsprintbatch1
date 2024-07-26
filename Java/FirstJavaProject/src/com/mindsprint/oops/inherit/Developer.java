package com.mindsprint.oops.inherit;

public class Developer extends Employee{
    String skill;
    public Developer(int id,String name, String department,double salary,
                     String skill){
        super(id,name,department,salary);
        this.skill=skill;
    }
    //developer will get fix bonus
    public int getBonus(){
        return 5000;
    }
    //display
    public void display(){
        super.display();
        System.out.println("Skills: "+skill);
    }
}
