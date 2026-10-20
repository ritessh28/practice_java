package Java8.MethodReference;

import javax.swing.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        Supplier<ArrayList<Integer>>newList=ArrayList<Integer>::new;
        ArrayList<Integer>li=newList.get();
        System.out.println(li.add(10));
    }
}
