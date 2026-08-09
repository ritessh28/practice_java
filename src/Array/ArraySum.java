package Array;

public class ArraySum {
    public static void main(String[]args)
    {
        //int []arr={80,70,60,50,10,20,5,90};
        int []arr={90,10,5,3,100,50,40,800};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum is "+sum);
    }
}
