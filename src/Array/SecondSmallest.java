package Array;

public class SecondSmallest {
    public static void main(String[] args) {
        int []arr={20,90,100,1,400,200,6};
        int small=arr[0];
        for(int n:arr)
        {
            if(n<small)
                small=n;
        }
        int second_small=arr[0];
        for(int n:arr)
        {
            if(n<second_small&&n>small)
                second_small=n;
        }
        System.out.println(small);
        System.out.println(second_small);
    }
}
