package com.mindsprint.oops.basics;

public class StudentGMS {
    String name;
    int[] grades;

    public StudentGMS(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double calculateAverage(){
        int sum=0;
        for(int grade:grades){
            sum+=grade;
        }
        return  sum/grades.length;
    }
    public void  displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Average: "+calculateAverage());
    }

    public static void main(String[] args) {
        int[] grades={78,89,90,67,90};
        StudentGMS s1= new StudentGMS("Sonam",grades);
        StudentGMS s2= new StudentGMS("Alex",new int[]{90,34,56,78});
        s1.displayInfo();
        s2.displayInfo();
    }
}
