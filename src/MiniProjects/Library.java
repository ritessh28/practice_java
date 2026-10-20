package MiniProjects;
import java.util.*;

public class Library {
    final private Map<String, BookL> books = new HashMap<>();
    final private Map<String, MemberL> members=new HashMap<>();
    final private Map<String,String> borrowed=new HashMap<>();

    // method that addBook in the BookL hashmap
    // if book with id is present throws IllegalArgumentException does not duplicate hashmap
    public void addBook(BookL book)  {
        if (!books.containsKey(book.getId())) {
            books.put(book.getId(), book);
            System.out.println("book added with id:" + book.getId());
        } else {
            throw new IllegalArgumentException("book is already present" + book.getId());
        }

    }

    //find a particular book by Id
    //id book is not present throws exception
    //checking of null is mandatory cause if mapping or book is not present it returns null
    // so if null throw exception or return book
    public BookL findById(String id) {
        BookL book = books.get(id);
        if (book == null)
            throw new IllegalArgumentException("book is not present " + id);
        return book;
    }

    //list all the books in the hashmap
    //if empty prints message
    public void listBooks()
    {
        if(books.isEmpty()) {
            System.out.println("no books present");
            return;
        }
        else {
            for (BookL b : books.values()) {
                System.out.println(b);
            }
        }
    }
    //removes a particular book from the books map takes id as argument
    //it has 2 restrictions
    //if we cannot find the book with provided id throw exception
    //if the book is already borrowed by a person in that case also throw exception
    //if both are satisfied remove book
    public void removeBook(String bookId)
    {
        findById(bookId);
        if(borrowed.containsKey(bookId))
            throw new IllegalStateException("book is currently borrowed, cannot remove "+bookId);
        books.remove(bookId);
    }
    //takes comparator as an argument cause our own comparator implementing class Id compartor or title implements comparator
    //so we can pass its subclass implementing classes so comparator as argument
    //Arraylist has a constructor which accepts collection as a argument so we pass books.value cause it returns set
    //so in arraylist it stores values of book sequentially
    //as set does not contain duplicates and the order is also not preserved so we store it in list first then sort
    //so in list order is also preserved so we return the list
    public List<BookL> getSortedBooks(Comparator<BookL> bookComparator)
    {
        List<BookL> list2=new ArrayList<>(books.values());
        list2.sort(bookComparator);
        return list2;

    }
    //takes year as an argument
    // removes the book which have less year then the provided year and returns th count of it
    //iterator is used because it even increases the mod count meaning it change the entire map
    //if we directly remove through collection name the iterator remembers the previous modcount so length becomes unmatched
    //concurrent modification exception if we do it through iterator it even changes the iterator's mod count value
    //so mod count = length returns true cause mod count is also increased or decreased when element is removed
    // we are using book.values.iterator cause book.iterator dont work cause we have not implemented iterator interface
    //in bookL class so as values() returns set and set or its subclass have implemented iterator interface we do it
    // we check if year is lower and even if it is borrowed or not
    public int getBooksOlderThan(int year)
    {
        Iterator<BookL> it=books.values().iterator();
        int count=0;
        while(it.hasNext())
        {
            BookL b=it.next();
            if(b.getYear()<year&&!borrowed.containsKey(b.getId())) {
                it.remove();
                count = count + 1;
            }
        }
        return count;

    }



    //Member
    //takes member as an argument and add a member to the memberMap
    //if id is present does not add just as book and throws exception
    public void registerMember(MemberL memberL)
    {
        if(!members.containsKey(memberL.getMemberId()))
        {
            members.put(memberL.getMemberId(), memberL);
            System.out.println("new member added");
        }
        else
        {
            throw new IllegalArgumentException("member already present "+ memberL.getMemberId());
        }
    }
    //takes member id as argument
    //and return member if present or throws exception
    public MemberL findMemberById(String id)
    {
        MemberL member=members.putIfAbsent(id,null);
        if(member==null)
            throw new IllegalArgumentException("member does not exist "+id);
        return member;
//        if(members.containsKey(id))
//            return members.get(id);
//        else
//        {
//            throw new IllegalArgumentException("member does not exist "+id);
//        }
//
    }

    //Borrowed
    //takes BookId and MemberId as an arguments
    //first check if book with provided id and member with id is present or not if no throws exception
    //and checks if member has already borrowed that book
    //if already borrowed throws exception otherwise add book id as key member id as value in borrowed map
    public void borrowBook(String bookId,String memberId)
    {

        findById(bookId);
        findMemberById(memberId);
        if(borrowed.containsKey(bookId))
        {
            throw new IllegalArgumentException("book already borrowed "+bookId);
        }
        borrowed.put(bookId,memberId);
        System.out.println("book successfully borrowed book id: "+bookId+" member id : "+memberId);
    }
    //takes book id as argument
    //first check if book with provided id exists and even some member has borrowed it
    //if yes removes the borrower
    //else throws exception
    public void returnBook(String bookId)
    {
        findById(bookId);
        if (borrowed.containsKey(bookId))
        {
            String memberId=borrowed.remove(bookId);
            System.out.println("book returned successfully bookId: "+bookId+" memberId: "+memberId);
        }
        else
        {
            throw new IllegalArgumentException("no such book borrowed bookId: "+bookId);
        }
    }



}

//separate comparators based on id ,title, year and author
// all implement comparable
class TitleComparator implements Comparator<BookL>
{
    @Override
    public int compare(BookL b1, BookL b2)
    {
        int result = b1.getTitle().compareToIgnoreCase(b2.getTitle());
        if (result != 0)
            return result;
        return b1.getId().compareTo(b2.getId());
    }
}
class YearComparator implements Comparator<BookL>
{
    @Override
    public int compare(BookL b1,BookL b2)
    {
        if(b1.getYear()!=b2.getYear())
            return Integer.compare(b1.getYear(),b2.getYear());
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}
class IdComparator implements Comparator<BookL>
{
    @Override
    public int compare(BookL b1,BookL b2)
    {
        return b1.getId().compareTo(b2.getId());
    }

}
class AuthorComparator implements Comparator<BookL>
{
    @Override
    public int compare(BookL b1,BookL b2)
    {
        if(!b1.getAuthor().equalsIgnoreCase(b2.getAuthor()))
            return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}
