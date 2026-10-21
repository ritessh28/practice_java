package singleton;

import Oops.InnerClass.Private;

public class EagerStaticInitialization {
    private EagerStaticInitialization()
    {

    }
    public static EagerStaticInitialization instance=new EagerStaticInitialization();
    public static EagerStaticInitialization getInstance()
    {
        return instance;
    }

}
class Main
{
    public static void main(String[] args) {
        EagerStaticInitialization obj=EagerStaticInitialization.getInstance();
        EagerStaticInitialization obj2=EagerStaticInitialization.getInstance();
        System.out.println(obj==obj2);
    }
}
//so basically in eager initialization we don't wait for the request from the user or anyone before creating instance
// without user request also the instance is already created so it causes wastage of heap memory even if the user does
//not ask instance, but it has already  created
