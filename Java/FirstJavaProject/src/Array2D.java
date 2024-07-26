public class Array2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{7,8,9,6}};

        for(int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+"\t");
            }
            System.out.println();
        }
        System.out.println("Print using for each");
        for(int[] a:arr){
            for(int num:a){
                System.out.print(num+" \t");
            }
            System.out.println();
        }
    }
}
