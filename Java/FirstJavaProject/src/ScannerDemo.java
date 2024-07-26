import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2= scanner.nextInt();
        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        System.out.println("Division: "+ (num1/num2));
    }
}
