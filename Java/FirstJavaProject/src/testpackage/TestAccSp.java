package testpackage;

import com.mindsprint.oops.basics.AccessSpecifier;

public class TestAccSp {
    public static void main(String[] args) {
        AccessSpecifier obj= new AccessSpecifier();
//        System.out.println("default "+ obj.num1);
//        System.out.println("Private "+ obj.num2);
        System.out.println("Public "+ obj.num3);
//        System.out.println("Protected "+ obj.num4);

        //outside the package only public accessible
    }
}
