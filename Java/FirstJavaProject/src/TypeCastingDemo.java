public class TypeCastingDemo {
    public static void main(String[] args) {
        int num1=20;
        long num2=num1; //Implicit Typecasting
        System.out.println("Number1: "+num1+" Number 2: "+num2);
        byte data=(byte) num2; //Explicit
        System.out.println("Converted to Byte "+data);
        int mydata= (int) 45.67; //Explicit
        System.out.println("Int: "+mydata);
    }
}
