package MultiThreading;

public class InternalLockMechanism1 {
    static void main(String[] args) {
        Bank1 obj=new Bank1();
        Thread t1=new Thread(()->
        {
            obj.deposit();
        });
        Thread t2=new Thread(()->
        {
//            try
//            {
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e)
//            {
//
//            }
            try {
                obj.withdraw();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();
        t1.start();


    }

}
class Bank1
{
//    Bank1 lock1=new Bank1();
//    Bank1 lock2=new Bank1();
    Object lock1=new Object();
    Object lock2=new Object();
    public void deposit()
    {
        System.out.println("deposit method starts");
        synchronized (lock1) {

            System.out.println("depositing some money");
        }
        System.out.println("deposit method ends ");

    }
    public  void withdraw() throws InterruptedException {
        System.out.println("withdraw method starts");
        synchronized (lock2) {
            Thread.sleep(2000);
            System.out.println("withdrawing some money");
        }
        System.out.println("withdraw method ends");
    }
}
// the problem which occurred in the first program can be solved by using two different object in synchronized blocks
// so the blocks are independent they are not dependent on a object lock to release they can execute parallel
// because of two different objects their locks are different not same