package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int []arr={20,90,100,1,400,200};
        int large=arr[0];
        for(int n:arr)
        {
            if(n>large)
                large=n;
        }
        int second_large=arr[0];
        for(int n:arr)
        {
            if(n>second_large&&n<large)
                second_large=n;
        }
        System.out.println(large);
        System.out.println(second_large);
    }
}
