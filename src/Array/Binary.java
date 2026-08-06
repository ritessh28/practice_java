package Array;

public class Binary {
    static int binarySearch(int []arr,int search_ele)
    {
        int beg=0;
        int end=arr.length-1;
        while(beg<=end)
        {
            int mid=(beg+end)/2;
            if(arr[mid]==search_ele)
            {
                return mid;
            }
            if(arr[mid]>search_ele)
                end=mid-1;
            else
                beg=mid+1;
        }
        return -1;
    }
    public static void main(String []args)
    {
        int []arr={5,10,15,30,40};
        int search_ele=40;
        System.out.println(binarySearch(arr,search_ele));

    }
}
