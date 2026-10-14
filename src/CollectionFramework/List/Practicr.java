package CollectionFramework.List;

import java.util.*;

public class Practicr {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);

        list.set(0, "Z");
        arr[1] = "Y";
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        class Student {
            String name;
            Student(String name) { this.name = name; }
        }

        Set<Student> set = new HashSet<>();
        set.add(new Student("Ritesh"));
        set.add(new Student("Ritesh"));
        System.out.println(set.size());
        Set<String> str = new HashSet<>();
        str.add("ritesh");
        str.add("ritesh");
        System.out.println(str.size());
        Set<String> a = new HashSet<>();
        Set<String> b = new LinkedHashSet<>();
        Set<String> c = new TreeSet<>();

        for (String s : new String[]{"banana", "apple", "cherry", "apple"}) {
            a.add(s); b.add(s); c.add(s);
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String s = "ban";
//        Map<Character, Integer> freq = new HashMap<>();
//
//        for (char ci : s.toCharArray()) {
//            freq.put(ci, freq.get(ci) + 1);
//        }
//        System.out.println(freq);
        Map<String, Integer> m = new HashMap<>();
        m.put("a", 1);
        m.put("b", 2);
        m.put("c", 1);

        for (String key : m.keySet()) {
            if (m.get(key) < 2) {
                m.remove(key);
            }
        }
        System.out.println(m);

    }
}
