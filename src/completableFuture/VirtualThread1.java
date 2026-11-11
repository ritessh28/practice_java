package completableFuture;

public class VirtualThread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1;
        for(int i=1;i<=10;i++) {
            t1 = Thread.startVirtualThread(() ->
            {

                System.out.println(Thread.currentThread());
//               try
//               {
//                   Thread.sleep(200);
//               }
//               catch (InterruptedException e)
//               {
//                   System.out.println(e.getMessage());
//               }
//               System.out.println("exiting "+i+" "+Thread.currentThread());


            });
            t1.join();
        }
    }
}
//virtual thread are just created inside the jvm virtual meaning physically they are not present just they exist virtually
//when their need arises it points to the existing thread in operating system O/S threads are the actual thread which
// run on cpu, and we cannot create  as many number of o/s threads it depends on the system how many cores it has
//so how it works it may create any no of virtual threads and when task arrives it just point to the o/s threads and suppose
//if the task is completed it loses its connection to the os threads and then again work for other work to arrive
//it can even perform work in different os threads not a single dependent os threads and if we use Thread local with
//virtual threads then as it create separate copy of variable or object for each reference there are more chance of
//memory
//virtual threads are flexible (switch between different os threads) and save memory as the space they acquire
// is very less and even we can reuse vt once it completes its task it gets destroyed and again present in jvm as vt
// when again it gets work it may start executing again os threads  are permanent they have a exact fixed pool in which
//they operate


/*Virtual Threads (The Task-Workers): They are born to run a single task, and the moment that task finishes,
  the virtual thread dies and its memory is instantly cleaned up by the garbage collector.
  You never reuse the same virtual thread object for a brand-new task.
  Carrier Threads (The OS Threads): They stay alive permanently. The underlying OS threads are managed in a fixed pool by
  the JVM, constantly waiting around to have virtual threads mount onto them, run for a bit, unmount, and then instantly
  pick up the next virtual thread.
 */
//In short: Virtual threads are disposable, while carrier threads are permanent and reusable.