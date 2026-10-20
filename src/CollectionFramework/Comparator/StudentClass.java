package CollectionFramework.Comparator;

import java.util.*;

public class StudentClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student( 80,"Ravi"));
        list.add(new Student( 80,"Amit"));
        list.add(new Student(95,"Suresh"));
        list.add(new Student(60,"Rohit"));
        list.sort(new MarksAscendingComparator());
        System.out.println(list);
        list.sort(new MarksThenNameComparator());
        System.out.println(list);
    }
}
class Student
{
    int marks;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                "}\n";
    }

    public Student(int marks, String name)
    {
        this.name=name;
        this.marks=marks;
    }

}
class MarksAscendingComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2)
    {
        return s1.marks-s2.marks;
    }
}
class MarksThenNameComparator implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.marks!=s2.marks)
            return s1.marks-s2.marks;
        return s1.name.compareTo(s2.name);
    }
}
//difference between comparable and comparator
/*
 * ===================== COMPARABLE vs COMPARATOR =====================
 *
 * COMPARABLE  ->  "I know how to compare myself."
 *   - The class has ONE built-in order, called its natural ordering.
 *   - Written INSIDE the class by implementing Comparable<T>.
 *   - Method: compareTo(other)  -> one argument; "this" is the other side.
 *   - Sorting and sorted collections use it automatically (nothing extra to pass).
 *   - Package: java.lang (no import needed).
 *   - Use when there is one obvious order everyone agrees on
 *     (numbers ascending, strings alphabetical, dates oldest first).
 *
 * COMPARATOR  ->  "I am an outside judge who compares any two objects."
 *   - The order lives OUTSIDE the class, so the class is never edited.
 *   - Method: compare(a, b)  -> two arguments.
 *   - You pass it to the sort or to the sorted collection when you need it.
 *   - You can have as many comparators as you want for the same class.
 *   - Package: java.util (import needed).
 *   - Use when you need several orders, a different order than the natural
 *     one, or when you cannot edit the class (like String).
 *
 * SAME RULE FOR BOTH (the sign of the returned int is what matters):
 *   negative -> first one comes BEFORE the second
 *   positive -> first one comes AFTER the second
 *   zero     -> tie / equal for ordering purposes
 *
 * ASCENDING vs DESCENDING:
 *   - this/a on the left   -> ascending  (smallest first)
 *   - other/b on the left  -> descending (biggest first)
 *   - Prefer Integer.compare(x, y) over subtraction (x - y can overflow).
 *
 * REAL-LIFE EXAMPLE:
 *   Height is part of a person (Comparable). "Line up by age / by name /
 *   by height" are rules the teacher announces (Comparator).
 *
 * WARNINGS:
 *   - Comparable needs to be implemented, or sorting fails
 *       Collections.sort(list)  -> compile error
 *       list.sort(null)         -> ClassCastException at runtime
 *   - TreeSet / TreeMap decide "duplicate" using compareTo/compare returning 0,
 *     NOT equals(). Two different objects that compare as 0 -> one is dropped.
 *     Fix: add a tie-breaker (e.g. marks first, then name).
 *   - Keep compareTo consistent with equals().
 *
 * ONE LINE:
 *   Comparable = the class's DEFAULT order.
 *   Comparator = a CUSTOM order chosen at the time of sorting.
 * ====================================================================

public class ComparableVsComparatorNotes {
    public static void main(String[] args) {
        // notes only
    }
}*/