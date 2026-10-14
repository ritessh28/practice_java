package Array;
import java.util.*;
public class Seven44 {
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]+ arr[j]==s) {
                    li.add(new int[]{i, j});
                }
            }
        }
        return li;
    }
    public static void main(String[] args) {
       int []arr={1,2,3,4,5};
       int s=arr.length;
       List<int []>l2=pairSum(arr,s);
        System.out.println(l2.size());
        for(int i=0;i< l2.size();i++)
        {
//            System.out.println(Arrays.toString(l2[i]));
        }


    }
}
