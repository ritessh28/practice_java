package Array;

public class Pivot {
       static void pivotIndex(int[] nums) {
        int m=nums.length/2;
        int leftsum=0;
        int rightsum=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            leftsum=leftsum+nums[i];
            rightsum=rightsum+nums[j];
            i++;
            j--;
        }
           System.out.println(rightsum+" "+leftsum);
    }

    static void main(String[] args) {
        int []arr={1,7,3,6,5,6};
        pivotIndex(arr);
    }
}
