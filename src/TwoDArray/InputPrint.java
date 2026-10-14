package TwoDArray;

import java.util.Scanner;

public class InputPrint {
    public static void main(String[] args) throws NullPointerException{
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.printf("enter value for arr[%d][%d]:",i,j);
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
//                System.out.printf("value at arr[%d][%d]:%d\n",i,j,arr[i][j]);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);

    }
}
