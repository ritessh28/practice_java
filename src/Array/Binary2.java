package Array;

public class Binary2 {
    static int binarysearch(int []arr,int search_ele)
    {
        int beg=0;
        int end=arr.length-1;
        while(beg<=end)
        {
            int mid=beg+(end-beg)/2;
            System.out.println(mid);
            if(arr[mid]==search_ele)
            {
                return mid;
            }
            if(arr[mid]>search_ele)
                beg=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int []arr={15,10,5,4,3,2};
        System.out.println(binarysearch(arr,15));
    }
}
