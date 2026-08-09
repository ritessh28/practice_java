package Array;
class ArraySort
{
    public static void main(String[]args)
    {
        //int []arr={80,70,60,50,10,20,5,90};
        int []arr={90,10,5,3,100,50,40,800};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
