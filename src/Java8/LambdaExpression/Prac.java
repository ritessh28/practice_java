package Java8.LambdaExpression;

import java.util.*;
import java.util.function.*;

public class Prac {
    public static void main(String[] args) {
        List<Supplier<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int j = i * 2;
            list.add(() -> j);
        }

        for (Supplier<Integer> s : list) {
            System.out.print(s.get() + " ");
        }
    }
}
