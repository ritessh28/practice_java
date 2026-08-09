package Array;

public class ReturnIndexIfPresent {
    static int check_index(int []arr,int no)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==no)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        int []arr={90,10,5,3,100,50,40,800};
        int check_no=800;
        int res=check_index(arr,check_no);
        if(res==-1)
            System.out.println("element is not present");
        else
            System.out.println("element "+check_no+"is present at "+res+" index");
    }
}
