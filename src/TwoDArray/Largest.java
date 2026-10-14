package TwoDArray;

public class Largest {
    public static void main(String[] args) {
        int [][]arr=new int[][]{{1,2,3,8},{1000,4,5,6,900}};
//        arr= new int[][]{{5, 8, 10}, {}};
//        arr[0]=new int[3];{1,2,3};
//         arr=new int[][]{{1,2,3},{4,5,6}};
        int large=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>large)
                    large=arr[i][j];
            }
        }
        System.out.println(large);
    }

}