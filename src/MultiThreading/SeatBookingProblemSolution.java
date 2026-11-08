package MultiThreading;

import java.util.concurrent.atomic.AtomicReference;

public class SeatBookingProblemSolution {

    public static void main(String[] args)
    {
        SeatBooking1 s1=new SeatBooking1();
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
class SeatBooking1
{
    AtomicReference<String> seat=new AtomicReference<>("EMPTY");
    //creating atomic reference so operation would be done at once or not at all
    public boolean bookSeat(String name)
    {
        //check if the seat is empty or acquired if acquired by some person return false or jump directly to cas operation
        if(!seat.get().equals("EMPTY"))
        {
            return false;
        }
        return seat.compareAndSet("EMPTY",name);
        //if seat is not acquired by any person so perform cas operation (compare and set) compare if the seat value
        //is empty if yes then compare does it really contains empty cause other thread would have already got the seat
        // and if the seat is empty add person name to it and return true otherwise dont add anything and return false
    }

}
