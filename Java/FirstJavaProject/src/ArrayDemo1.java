public class ArrayDemo1 {
    public static void main(String[] args) {
        int numbers[];
        numbers= new int[5];
        String names[]= {"abc","def","hij"};
        numbers[0]=10;
        numbers[1]=20;
        numbers[3]=40;
        System.out.println("Print using for loop");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Print using for each loop");
        for(String name:names){
            System.out.println("Name: "+name);
        }
    }
}
