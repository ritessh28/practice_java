package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[]args)
    {
        System.out.println(+'a');
        System.out.println("a"+'b');
        System.out.println((char)('a'+3));
        System.out.println((char)('b' +3));
        int a=900;
        double d=a;
        byte b= (byte)a;
        System.out.println(b);
        System.out.println(+'a'+10+"b");
        System.out.println(10+"a");
        //integer will be converted to Integer and calls toString()
        //at last it will be "10" + "a"
        System.out.println(new Integer(56)+""+new ArrayList<>(Arrays.asList("goa","ramu")));
//        System.out.println(new Integer(56)+new ArrayList<>());
        //we cannot add two complex values directly
        // instead we can add string in between them because java has accesibility for that
        ArrayList<Integer> e=new ArrayList<>();
        e.add(10);
//        e.add(21.4);



    }
}
