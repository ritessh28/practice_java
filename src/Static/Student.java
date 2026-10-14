package Static;

public class Student {
    int id;
    String name;
    int rno;
    static int studentsJoined;

    public Student(int id, String name, int rno) {
        this.id = id;
        this.name = name;
        this.rno = rno;
        Student.studentsJoined+=1;
    }

}
