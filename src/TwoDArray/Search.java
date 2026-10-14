package TwoDArray;

public class Search {
    static boolean searchElement(int [][]arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==key)
                    return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(searchElement(arr,100));
    }


}
