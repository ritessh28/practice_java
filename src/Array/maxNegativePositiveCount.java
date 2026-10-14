package Array;

public class maxNegativePositiveCount {
    public static void main(String[] args) {
       int []nums= {-2,-1,-1,1,2,3};
       int p=0,n=0;
       for(int i:nums)
       {
           if(i>0)
               p+=1;
           else if(i<0)
               n+=1;
       }
       int res= Math.max(p, n);
        System.out.println(res);

    }
}
