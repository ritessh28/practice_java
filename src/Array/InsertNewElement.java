package Array;

public class InsertNewElement {
    public static void main(String[]args)
    {
        int []arr={10,20,30,40,50};
        int position=3;
        arr[position]=5;
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
