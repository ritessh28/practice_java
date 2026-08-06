package Array;

import java.util.Arrays;

public class Merge2 {
    static void main(String[] args) {
        {
            int []nums1={1,2,4,0,0,0};
            int []nums2={2,5,6};
            int n1=nums1.length/2;
            int n2=nums2.length;
            int k=n1+n2-1;
            int i=n1-1,j=n2-1;
            System.out.println(k);
            while(i>=0&&j>=0)
            {
                if(nums1[i]>nums2[j])
                {
                    nums1[k]=nums1[i];
                    k--;
                    i--;
                }
                else
                {
                    nums1[k]=nums2[j];
                    k--;
                    j--;

                }

            }

            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
            System.out.println(nums1[1]=nums1[1]);

            System.out.println(Arrays.toString(nums1));
            while(i>=0)
            {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            while(j>=0)
            {
                nums1[k]=nums2[j];
                j--;
                k--;
            }

            System.out.println(Arrays.toString(nums1));

        }
    }
}
