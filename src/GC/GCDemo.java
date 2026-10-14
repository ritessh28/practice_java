package GC;


public class GCDemo {
    int id;

    GCDemo(int id) {
        this.id = id;
        System.out.println("Object " + id + " created");
    }

    @Override
    protected void finalize() {
        System.out.println("Object " + id + " garbage collected");
    }

    public static void main(String[] args) {
        GCDemo obj1 = new GCDemo(1);
        GCDemo obj2 = new GCDemo(2);
//        for(int i=0;i<2000;i++)
//        {
//            new GCDemo(i);
//        }

        obj1 = null; // Object 1 becomes unreachable
        // obj2 is still reachable — should NOT be collected

        System.out.println("Requesting GC...");
        System.gc(); // just a request/hint — not guaranteed

        // Give GC thread a moment (not reliable, just for demo purposes)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        System.out.println("End of main");
    }
}