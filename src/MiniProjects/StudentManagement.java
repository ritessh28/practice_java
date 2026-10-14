
package MiniProjects;
import java.util.Arrays;
import java.util.Scanner;
class Student
{

    String name;
    int id,newId;
    int marks;
    Student(String name,int id,int marks)
    {
        this.name=name;
        this.id=id;
        this.marks=marks;
    }
}
public class StudentManagement {
    public Scanner sc=new Scanner(System.in);
    String name;
    int id,marks,newId;
    int count=0;
    public void addStudent(Student []stud)
    {
        if(count== stud.length)
        {
            System.out.println("student storage is full");
            return;
        }

        System.out.println("enter student id:");
        id=sc.nextInt();
        boolean ans=ifIdExists(stud,id);
        if(!ans) {
            System.out.println("enter student name:");
            name=sc.next();
            System.out.println("enter marks:");
            marks = sc.nextInt();
            stud[count] = new Student(name, id, marks);
            count++;
        }
        else
        {
            System.out.println("Student id already exists ");
            System.out.println("try again");
            addStudent(stud);
        }

    }
    public boolean ifIdExists(Student[] stud,int id)
    {
        for(int i=0;i<count;i++)
        {
            if(stud[i].id==id)
            {
                return true;
            }
        }
        return false;
    }
    public void displayAllStudentDetails(Student []stud)
    {
//        System.out.println(count);
        if(count==0)
        {
            System.out.println("no record of students");
        }
        else {
            for (int i = 0; i < count; i++) {
                System.out.println("student"+(i+1)+" details are:");
                System.out.println("student name:" + stud[i].name);
                System.out.println("student id:" + stud[i].id);
                System.out.println("student marks:" + stud[i].marks);
            }
        }

    }

    public void searchStudent(Student[]stud,int id)
    {
        for(int i=0;i<count;i++)
        {
            if(stud[i].id==id)
            {
                System.out.println("Student details are:");
                System.out.println("student name:"+stud[i].name);
                System.out.println("student id:"+stud[i].id);
                System.out.println("student marks:"+stud[i].marks);
                return;
            }
        }
        System.out.println("no student record present");

    }
    public void deleteStudent(Student []stud,int id)
    {
        for(int i=0;i<count;i++)
        {
            if(stud[i].id==id) {
                for (int j = i; j < count - 1; j++) {
                    stud[j] = stud[j + 1];
                }
                stud[count - 1] = null;
                count--;
                System.out.println("student record deleted successfully");
                return;
            }

        }

        System.out.println("no student record present");
    }
    public void updateStudentDetails(Student []stud,int id)
    {

        for(int i=0;i<count;i++) {
            if (stud[i].id == id)
            {
                System.out.println("enter update details:");
                System.out.println("enter student name:");
                name=sc.next();
                System.out.println("enter student id:");
                newId=sc.nextInt();
                System.out.println("enter marks:");
                marks=sc.nextInt();
                if(!ifIdExists(stud,newId)) {
                    stud[i].id = newId;
                    stud[i].name = name;
                    stud[i].marks = marks;
                    return;
                }
                else
                {
                    System.out.println("id already exist in student record try another id");
                    return;
                }
            }


        }
        System.out.println("no student record present");


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] students = new Student[10];
        StudentManagement sm=new StudentManagement();
        int id,ch=0;
        do
        {
            System.out.printf("Student Management project\n" +
                    "1.AddStudent\n" +
                    "2.Display All Student Details\n" +
                    "3.Search a student\n"+
                    "4.Delete Student\n"+
                    "5.update student details\n"+
                    "6.exit\n");
            System.out.println("enter your choice:");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    sm.addStudent(students);
                    break;
                case 2:
                    sm.displayAllStudentDetails(students);
                    break;

                case 3:
                    System.out.println("enter student id:");
                    id = sc.nextInt();
                    sm.searchStudent(students, id);
                    break;
                case 4:
                    System.out.println("enter student id:");
                    id = sc.nextInt();
                    sm.deleteStudent(students,id);
                    break;
                case 5:
                    System.out.println("enter student id:");
                    id = sc.nextInt();
                    sm.updateStudentDetails(students,id);
                    break;
                case 6:
                    break;
            }
        } while(ch!=6);
//        System.out.println(Arrays.toString(students));
//        System.out.println(students[0].name);

    }
}
