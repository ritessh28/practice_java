package Array;

public class SubArraySumK {

    public static int subarraySum(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            int cnt=0;
            for(int j=i;j<nums.length;j++)
            {
                cnt=cnt+nums[j];
                if(cnt==k)
                {
                    res++;
                }

            }
        }
        return res;
    }

    static void main(String[] args) {
        int []arr={1,2,1,2,1};
        System.out.println(subarraySum(arr,3));

    }

}
