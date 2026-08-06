package Array;

import java.util.Arrays;

public class Merge {
    public static void merge(int a[],int n,int []b,int m)
    {
       int i=0,j=0;
       int []c=new int[m+n];
       while(i<n&&j<m)
       {
           if(a[i]<b[j])
           {
               System.out.println(a[i]);
               c[i]=a[i];
               i++;
//               System.out.println(c[i]);
           }
           else if(a[i]>b[j])
           {
               System.out.println(b[j]);
               c[j] = b[j];
               j++;

           }

       }
       while(i<n)
       {
           c[i]=a[i];
           i++;
       }
       while(j<m)
        {
            c[j]=b[j];
            j++;
        }
       System.out.println(Arrays.toString(c));

    }

    public static void main(String[]args)
    {
        int []nums1={1,2,4,0,0,0};
        int []nums2={2,5,6};
        int n1=nums1.length/2;
        int n2=nums2.length;
        System.out.println(n1);
//        merge(nums1,n1,nums2,n2);
        int []c=new int[n1+n2];
        int k=0;
        int i=0,j=0;
        while(i<n1&&j<n2)
        {
            if(nums1[i]<=nums2[j])
            {
                c[k]=nums1[i];
                System.out.println(c[i]);
                i++;
                k++;


            }
            else
            {
                c[k]=nums2[j];
                j++;
                k++;
            }
        }
        System.out.println(i);
        System.out.println(j);
        while(i<n1)
        {
            c[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            c[k]=nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(c));




    }
}
