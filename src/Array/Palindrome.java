package Array;

public class Palindrome
{
    public static void main(String[]args)
    {
        int []arr={5,10,15,10,5};
        System.out.println("is this"+IsPalindrome(arr));
    }
    static boolean IsPalindrome(int []arr)
    {
        for(int i = 0; i< arr.length/2; i++)
        {
            int start=arr[i];
            int end=arr[arr.length-1-i];
            System.out.println(start+" "+end);
            if(start!=end)
                return false;


        }
        return true;
    }






}