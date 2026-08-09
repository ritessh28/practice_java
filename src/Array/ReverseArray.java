package Array;

public class ReverseArray {
    public static void main(String[]args)
    {
        int []a={10,5,8,9,7,6,4};
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("elements are:");
        for(int n:a)
        {
            System.out.print(n+" ");
        }
    }
}
