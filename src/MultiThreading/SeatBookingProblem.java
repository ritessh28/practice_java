package MultiThreading;

public class SeatBookingProblem {
    public static void main(String[] args)
    {
        SeatBooking s1=new SeatBooking();
        Thread t1=new Thread(()->
        {
            System.out.println(s1.bookSeat("ritesh"));
        });
        Thread t2=new Thread(()->
        {
            System.out.println(s1.bookSeat("rohit"));
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("seat has acquired by "+s1.seat);

    }
}
class SeatBooking
{
    String seat =null;
    public boolean bookSeat(String name)
    {
        if(seat==null)
        {
            seat=new String(name);
            return true;
        }
        return false;
    }

}
//so the description of this problem is that only one seat is available for booking and multiple thread may try to acquire
//it either concurrently by (context switching) or parallel by using separate cpu(cores) for every thread so in either of
// the way if it reads the book seat as null then both would try to acquire it concurrently by context switching or parallel
// by multiple thread executing at once so even if a certain Thread has received a seat the other thread may override it
// so to solve this problem we have Atomic Reference with (CAS) operation compareAnsSet present in AtomicReference
// what it does is it allows only one thread to enter the cas operation at a  time so if it gets a seat then another
// thread gets a chance to enter the cas operation so as it compare for a specific value like Empty in our case but seat
// already holds the name of who have acquired the seat so it fails to assign seat to it and returns false
