package TwoDArray;

import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr3 =new int[arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
