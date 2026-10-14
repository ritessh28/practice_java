package TwoDArray;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {
        int [][]arr2={{1,2},{4,5,6,7,8,9}};
        // 0 1 2 3 4 5
       //0 1 2
       //1 4 5 6 7 8 9
        System.out.println(arr2[1][0]);
        System.out.println(arr2[0][0]);
        System.out.println(arr2[1][5]);
        System.out.println(arr2[0].length);
        System.out.println(arr2[1].length);
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


    }
}
