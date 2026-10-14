package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveByValue {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(5,12,9,3,4));
        al.remove(Integer.valueOf(12));
//        al.remove(12);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
    }
}
