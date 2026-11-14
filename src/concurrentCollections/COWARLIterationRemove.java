package concurrentCollections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWARLIterationRemove {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>(List.of(10,20,30,40));
        Iterator<Integer>it= list.iterator();
        while (it.hasNext())
        {
            int res=it.next();
            if(res==20)
            {
                //we get unsupported operation while removing through list because COWAL creates a cloned copy for
                //update operations but iterator does not so remove() through iterator is not allowed because of
                //that problem
                it.remove();
            }
            System.out.println("element is "+res);
        }
    }
}
