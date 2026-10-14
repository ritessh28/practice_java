package singleton;

public class MainSingleTon {
    public static void main(String[] args) {
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        System.out.println(obj1==obj3);
        // all obj1 2 and 3 points to the same object singleton class


    }
}
