package Array;

import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {

            int []ar={2,2,3,3,3,3,3,1,2,4,4,4,4,4,4,4,4,4,4};
//            int []freq;
//            freq=new int[6];
//            for(int i=0;i<ar.length;i++)
//            {
//
//                freq[ar[i]]++;
//            }
//        int large=freq[0];
//        for(int i=0;i<freq.length;i++)
//        {
//            if(freq[i]>large)
//                large=freq[i];
//        }
//        System.out.println(Arrays.toString(freq));
//        System.out.println(large);
        int c=0,count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(count==0) {
                c = ar[i];
            }
            if(c==ar[i]) {
                count++;
            }
            else
                count--;
        }
        System.out.println(c);

    }
}
