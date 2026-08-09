package Array;

public class CheckNoisPresent {
    public static void main(String[]args)
    {
        int []arr={90,10,5,3,100,50,40,800};
        int check_no=1;
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==check_no)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println(check_no+" is availabe in array");
        else
            System.out.println(check_no+" is not availabe in array");
    }
}
