import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int size= sc.nextInt();
        int[] array= new int[size];
        System.out.println("Please Insert below expected data");
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter any number");
            array[i]= sc.nextInt();
        }
        int largest=array[0];
        System.out.println("Let's Print the array");
        for (int num:array){
            if(num>largest){
                largest=num;
            }
            System.out.println(num);
        }
        System.out.println("Largest "+largest);
    }
}
