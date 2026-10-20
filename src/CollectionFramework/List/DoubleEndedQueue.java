package CollectionFramework.List;

import java.util.ArrayDeque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.offer(10);
        deque.add(20);
        deque.offer(30);
        deque.add(40);
        deque.offer(50);
        System.out.println(deque);
        deque.addFirst(5);
        deque.addLast(90);
        System.out.println(deque.getFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.offerFirst(4));


    }
}
