package CollectionFramework.List;

import java.util.PriorityQueue;

public class PriorityQueueMeth {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        System.out.println(pq.add(5));
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        int i=0;
        while(i<3)
        {
            i++;
            if(i==2)
                continue;
            System.out.println(i+"");


        }


    }
}
