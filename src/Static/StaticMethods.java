package Static;
public class StaticMethods {
    static int a;

    static void m1() {
        System.out.println("inside static method m1");
    }

    public static void main(String[] args) {
        StaticMethods.m1();
        StaticMethods obj = new StaticMethods();
        obj.m1();
    }
}
