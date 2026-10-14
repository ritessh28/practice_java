package Array;

import java.util.Arrays;

public class MediantwoSortedArrays {
    public static void main(String[] args) {
        int []nums1={1,2};
        int []nums2={3,4};
//        int[]nums1={2,2,2,4,4};
//        int[]nums2={2,2,4,4};
        int []nums3=new int[(nums1.length+nums2.length)];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length)
        {
            if(nums1[i]<=nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<nums1.length)
        {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            nums3[k] = nums2[j];
            k++;
            j++;
        }
        System.out.println(Arrays.toString(nums3));
//        int sum=0;
//        for(int l:nums3)
//        {
//            sum=sum+l;
//        }
////        System.out.println(((double)sum/nums3.length));
//        double ans=(double)sum/nums3.length;
//        System.out.println(Math.ceil(ans));
//        System.out.println(Math.abs(ans));
//        double res=(nums3.length%2==0)?nums3.length/2:nums3[nums3.length/2]+nums3[nums3.length/2+1]/2;
//        System.out.println(res);
//        double res;
//        if(nums3.length%2==0)
//        {
//            System.out.println("true");
//            res=(nums3[nums3.length/2]+nums3[nums3.length/2-1])/2.0;
//           double l=nums3[nums3.length/2-1];
//            System.out.println(l);
//            System.out.println(res);
//        }
//        else
//        {
//            res=nums3[nums3.length/2];
//            System.out.println(res);
//            System.out.println("false");
//        }
        double res=(nums3.length%2==0)?nums3[nums3.length/2]+nums3[nums3.length/2-1]/2.0
                                        :nums3[nums3.length/2];
        System.out.println(res);
    }
}
