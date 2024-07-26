package testpackage;

import com.mindsprint.oops.basics.AccessSpecifier;

public class Child extends AccessSpecifier {
    public static void main(String[] args) {
        Child obj= new Child();
//        System.out.println("default "+ obj.num1);
//        System.out.println("Private "+ obj.num2);
        System.out.println("Public "+ obj.num3);
        System.out.println("Protected "+ obj.num4);
    }
}
