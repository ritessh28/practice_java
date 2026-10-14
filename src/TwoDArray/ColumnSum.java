package TwoDArray;

public class ColumnSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9 ,10}
        };

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.println("sum of column "+(i+1)+"is "+sum);
        }
//        System.out.println(3==null);
    }
}
