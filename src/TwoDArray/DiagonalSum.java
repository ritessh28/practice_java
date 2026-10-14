package TwoDArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = arr.length-1; i>=0; i--) {
            for (int j = arr.length-1; j>=0; j--) {
                if (i == j)
                    sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
