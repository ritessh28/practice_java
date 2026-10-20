package MiniProjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookL b1 = new BookL("b1", "java", "james", 2010);
        BookL b2 = new BookL("b2", "economics", "john", 2002);
        BookL b3 = new BookL("b3", "atomic habits", "virat", 2020);
        BookL b4 = new BookL("b4", "science", "ramesh", 2024);
        Library library = new Library();
        try {
            library.addBook(b1);
            library.addBook(b2);
            library.addBook(b3);
            library.addBook(b4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
//        try {
//            System.out.println(library.findById("b1"));
//            library.findById("2233");
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        library.listBooks();
//        try {
//            MemberL m1 = new MemberL("m1", "ritesh");
////            MemberL m2 = new MemberL("m123", "rohit");
//            MemberL m2 = new MemberL("m2", "rohit");
//            MemberL m3 = new MemberL("m3", "suresh");
//            MemberL m4= new MemberL("m4", "samarth");
//            library.registerMember(m1);
//            library.registerMember(m2);
//            library.registerMember(m3);
//            library.registerMember(m4);
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try {
//            System.out.println(library.findMemberById("m1234"));
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.borrowBook("b1","m1");
//            library.borrowBook("b2","m2");
//            library.borrowBook("b3","m3");
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.borrowBook("b22","m1");
//        }
//        catch (IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.returnBook("b1");
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.returnBook("b1");
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.removeBook("b4");
//            System.out.println("book successfully removed with id: b4 ");
//            library.removeBook("b2");
//        }
//        catch (RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.removeBook("b5");
//        }
//        catch (RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.findById("b4");
//        }
//        catch (RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.removeBook("b2");
//        }
//        catch(RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try
//        {
//            library.returnBook("b2");
//            library.removeBook("b2");
//            System.out.println("book removed successfully with id: b2 ");
//        }
//        catch (RuntimeException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        library.listBooks();

//        List<BookL> list = library.getSortedBooks(new AuthorComparator());
//        System.out.println("printing  books in sorted way based on author:");
//        for (BookL b : list) {
//            System.out.println(b);
//        }
//        List<BookL> list=library.getSortedBooks(new AuthorComparator());
//        System.out.println("printing  books in sorted way based on author:");
//        for(BookL b:list)
//        {
//            System.out.println(b);
//        }
//        System.out.println(library.getSortedBooks(new YearComparator()));
        LibraryManagement.sortMenu(library,sc);


    }
    public static void sortMenu(Library library,Scanner sc)
    {
        int choice;
        do {

            System.out.println("Sort books by\n" + "1.Title\n" + "2.Year\n" + "3.Id\n" + "4.Author\n"+"0.exit");
            System.out.println("enter your choice:");
            choice = sc.nextInt();
            Comparator<BookL> comparator = null;
            switch (choice) {
                case 1:
                    comparator = new TitleComparator();

                    break;
                case 2:
                    comparator = new YearComparator();
                    break;
                case 3:
                    comparator = new IdComparator();
                    break;
                case 4:
                    comparator = new AuthorComparator();
                    break;
                default:
                    System.out.println("invalid choice");
                    continue;
                case 0:
                    System.out.println("terminating ");
                    break;

            }
            if(comparator!=null)
            {
                List<BookL>list=library.getSortedBooks(comparator);
                for(BookL b:list)
                    System.out.println(b);
            }

        }while (choice!=0);

    }

}