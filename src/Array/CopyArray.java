package Array;

public class CopyArray {
    public static void main(String[]args)
    {
        int []arr={90,10,5,3,100,50,40,800};
        int []arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr2[i]=arr[i];
        }
        System.out.println("elements of array 1 are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("after iteration elements of array 2 are:");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
