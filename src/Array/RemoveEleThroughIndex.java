package Array;

public class RemoveEleThroughIndex {
    public static void main(String[]args)
    {
        int []arr={90,10,40,50};
        int size=arr.length;
        int remove_ele=10;
        int remove_ele_index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==remove_ele)
                remove_ele_index=i;
        }
        for(int i=remove_ele_index;i<size-1;i++)
        {
            arr[i]=arr[i+1];
        }
        size--;
        System.out.println("After removal elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
