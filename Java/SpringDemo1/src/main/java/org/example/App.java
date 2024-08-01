package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        Hello hello=(Hello) context.getBean("h");
        Hello hello2=(Hello) context.getBean("h");
        System.out.println(hello2==hello);

        hello.print();
        Student student=(Student) context.getBean("stu1");
        System.out.println(student.getId()+" "+student.getName()+" "+student.getEmail());
        System.out.println("City: "+student.getAddress().getCity());
        System.out.println("Street: "+student.getAddress().getStreet());
        System.out.println("ZipCode: "+student.getAddress().getZipcode());

        Employee emp= (Employee) context.getBean("emp1");
        System.out.println(emp.getId()+" "+emp.getName());
    }
}
