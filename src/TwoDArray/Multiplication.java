package TwoDArray;

public class Multiplication {
    public static void main(String[] args) {
        int [][]arr1={
                {1,2},
                {3,4}};

        int [][]arr2={
                {5,6},
                {7,8}};

    int [][]arr3=new int[2][2];
    for(int i=0;i< arr1.length;i++)
    {
        for(int j=0;j<arr2.length;j++) {
            int res = 0;
            for (int k = 0; k < arr1.length; k++)
            {
                res = res + arr1[i][k]*arr2[k][j];
            }
            arr3[i][j]=res;
        }
    }
    for(int i=0;i<arr3.length;i++) {
        for(int j=0;j<arr3.length;j++) {
            System.out.print(arr3[i][j]+" ");
        }
        System.out.println();
    }
 }
}
