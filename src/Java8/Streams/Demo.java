package Java8.Streams;

import java.util.Arrays;
import java.util.List;

import java.util.*;

import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Student s2 = s1;

        s2.name = "Amit";

        s1.name = null;

        System.out.println(s2.name);
    }
}

