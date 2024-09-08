import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int  size= scanner.nextInt();

        System.out.println("enter size1 of array");
        int size1 = scanner.nextInt();

        System.out.println("enter size2 of array");
        int size2 = scanner.nextInt();

        int[][][] arr = new int[size][size1][size2];

        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                System.out.println("enter element for index "+i+" "+j);
                for(int k = 0; k<arr[i][j].length; k++)
                {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
