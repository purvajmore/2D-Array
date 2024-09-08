import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter array row");
//        int row = scanner.nextInt();
//
//        System.out.println("enter array column");
//        int column = scanner.nextInt();
//
//        int[][] arr = new int[row][column];
//
//        for(int i = 0;i< arr.length;i++)
//        {
//            System.out.println("enter element at index "+i);
//            for(int j = 0;j<arr[i].length;j++)
//            {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

        int row = 3;
        int column = 3;
        int[][] array = new int[row][column];


        Scanner scanner1 = new Scanner(System.in);


        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.println("enter in row"+i+ "of"+j );
                array[i][j] = scanner1.nextInt();
            }
        }


        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {

                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
