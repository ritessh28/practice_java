package singleton;

import Oops.InnerClass.Private;

public class Singleton {
    private static final int a=100;
    private Singleton()
    {
    }
    public static   Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

}
