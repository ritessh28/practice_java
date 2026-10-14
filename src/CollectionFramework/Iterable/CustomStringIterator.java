package CollectionFramework.Iterable;

import java.util.Iterator;

public class CustomStringIterator {
    public static void main(String[] args) {
        String []names={"rakesh","ramesh","vikas","rahul"};
        StringContainer obj1=new StringContainer(names,names.length);
//        StringContainer.IterableStringContainer ib= new StringContainer(names, names.length).new IterableStringContainer();
//        while(ib.hasNext())
//        {
//            System.out.println(ib.next());
//        }
          Iterator<String> it= obj1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
class StringContainer implements Iterable<String> {
    private String[] names;
    private int size;

    public StringContainer(String[] names, int size) {
        this.names = names;
        this.size = size;
    }

    @Override
    public Iterator<String> iterator() {
//        return  new IterableStringContainer();
        return new Iterator<String>()
        {
            int pos=0;
            @Override
            public boolean hasNext() {
                return pos<size;
            }
            @Override
            public String next()
            {
                return names[pos++];
            }

        };
    }
    // as the class is used only once we can create it as anonymous class without any name to it

//    class IterableStringContainer implements Iterator<String> {
//        int pos=0;
//        @Override
//        public boolean hasNext() {
//            return pos<size;
//        }
//        @Override
//        public String next()
//        {
//            return names[pos++];
//        }
//    }
}