package Array;

public class bnry {
    public static void main(String[] args) {
        int []nums={-1,0,3,4,5,7,8,9};
        int target=4;
        int beg=0,end=nums.length-1;
        int idx=-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(nums[mid]==target) {
                idx = mid;
                break;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                beg=mid+1;
            }

        }
        System.out.println(idx);
    }
}
