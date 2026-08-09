package Array;

public class ArrayMaxMin {
    public static void main(String[]args)
    {
        int []a={90,60,50,10,5,8};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("max ele is "+max);
        System.out.println("min ele is "+min);
    }
}
