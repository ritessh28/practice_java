package Generics;

public class GenericArrays {
    public static void main(String[] args) {
        GenericArrayTypes o1=new GenericArrayTypes();
        Integer []ar={1,2,3};
        String []str={"st","ri","ng"};
        o1.printArray(str);
        o1.printArray(ar);

    }
}
class GenericArrayTypes
{
    public <T> void printArray(T[] arr)
    {
        for(T a:arr)
        {
            System.out.println(a);
        }
        System.out.println("");
    }
}