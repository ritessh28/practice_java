package MultiThreading;

public class InternalLockMechanism {
    static void main(String[] args) {
        Bank obj=new Bank();
        Thread t1=new Thread(()->
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {

            }
            obj.deposit();
        });
        Thread t2=new Thread(()->
        {
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {

            }
            obj.withdraw();
        });
        t1.start();
        t2.start();

    }

}
class Bank
{
    public  synchronized void deposit()
    {
        System.out.println("depositing some money");
    }
    public synchronized void withdraw()
    {
        System.out.println("withdrawing some money");
    }
}
// the issue of the above program is that we cannot perform multiple operations at once using single object
// suppose if we are depositing some money even if it takes huge amount of time as object lock is applied
//  withdraw  operation cannot be performed before the completion of deposit even  it is correct in terms of banking
// as a person cannot withdraw money and deposit money at once we are just looking for the problem which may be caused
// to solve this using single object we can use internal lock mechanism by creating two different object of that class
// itself and use synchronized block and pass the created object reference so that two object different lock may apply
//