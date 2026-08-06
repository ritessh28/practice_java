package Oops.Constructor;

public class Constructor3 {
    static {
        System.out.println("first static block");
    }
    {
        System.out.println("first instance block");
    }
    Constructor3()
    {
        System.out.println("inside constructor block");
    }
    public static void main(String[] args) {
        System.out.println("main block");
        new Constructor3();
        new Constructor3();

    }
    static
    {
        System.out.println("2 static block");
    }
    {
        System.out.println("inside 2 instance block");
    }
}

