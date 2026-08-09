package Array;

public class ArrayElementsIdentical {
    public static void main(String[]args)
    {
        int []arr1={9,8,7,5};
        int []arr2={3,4,5,6,8,9,5};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]+"is identical");
                }
            }
        }
    }
}
