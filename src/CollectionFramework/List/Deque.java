package CollectionFramework.List;

import java.util.ArrayDeque;
import java.util.Queue;

public class Deque {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);//unsafe throws exception if queue is full throws exception
        queue.offer(20);//safe returns false if queue is full does not throw exception
        System.out.println(queue.poll());// safe returns the first element in queue and deletes it
//        System.out.println(queue.remove());//unsafe same as poll but throws exception if queue is empty
        System.out.println(queue.peek());// safe returns null if queue is empty if element are present returns the element
//        System.out.println(queue.element());//unsafe but  same as above
        System.out.println(queue);
    }
}
