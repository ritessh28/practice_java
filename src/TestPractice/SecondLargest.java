package TestPractice;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr={10,100,9,5,89,0};
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest) {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second)
            {
                second=arr[i];
            }
        }
        System.out.println(second);
        System.out.println(largest);
    }
}
