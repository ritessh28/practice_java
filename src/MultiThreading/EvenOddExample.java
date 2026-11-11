package MultiThreading;

public class EvenOddExample {
    public static void main(String[] args) {
        EvenOdd obj=new EvenOdd(20);
        Thread t1=new Thread(()->
        {
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        Thread t2=new Thread(()->
        {
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });
        t1.start();
        t2.start();
    }
}
class EvenOdd
{
    int limit;
    int n=1;
    public EvenOdd(int limit)
    {
        this.limit=limit;
    }
    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (n <= limit)
            {
                while(n%2==1)
                {
                    wait();
                }
                if(n>limit)
                    break;
                System.out.println(Thread.currentThread().getName()+" "+n);
                n++;
                notifyAll();
            }

        }
    }
    public void printOdd() throws InterruptedException {
        synchronized (this)
        {
            while(n<=limit) {
                while (n % 2 == 0)
                    wait();

                if (n > limit)
                    break;
                System.out.println(Thread.currentThread().getName()+" "+n);
                n++;
                notifyAll();
            }
        }
    }
}
