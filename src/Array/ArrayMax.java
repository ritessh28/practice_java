package Array;

public class ArrayMax {
    static void main(String[] args) {
        int []arr={2,90,100,1};
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
                if(arr[i]>large)
                    large=arr[i];
        }
        System.out.println("largest element is :"+large);
    }
}
