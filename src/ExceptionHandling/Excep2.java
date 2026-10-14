package ExceptionHandling;

public class Excep2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[8] = 1;

        }
        catch (RuntimeException ae) {
            System.out.println(ae);
            try {
                System.out.println(10 / 0);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}