package TwoDArray;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8,}
        };
        int large=Integer.MIN_VALUE;
        System.out.println(large);
        int row=0;
        for(int i=0;i< arr.length;i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("sum of row" + (i + 1) + " is:" + sum);
            if(sum>large) {
                row = i;
                large = sum;
            }
        }

        System.out.println("largest sum row is "+(row+1)+" and sum is "+large);
    }
}
