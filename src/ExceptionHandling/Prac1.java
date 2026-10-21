package ExceptionHandling;

public class Prac1 {
}
//class Res implements AutoCloseable {
//    String name;
//
//    Res(String name)  {
//        this.name = name;
//        System.out.println("open " + name);
//    }
//
//    public void close() {
//        System.out.println("close " + name);
//    }
//}
//
// class Test1 {
//    public static void main(String[] args) {
//        try (Res a = new Res("1"); Res b = new Res("2")) {
//            System.out.println("body");
//            throw new RuntimeException("X");
//        } catch (RuntimeException e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//    }
//}
class Test2 {
    static void a() throws Exception {
        try {
            throw new Exception("first");
        } finally {
            throw new RuntimeException("second");
        }
    }

    public static void main(String[] args) {
        try {
            a();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
 class Test4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                if (i == 1) {
                    continue;
                }
                System.out.println("T" + i);
            } finally {
                System.out.println("F" + i);
            }
        }
    }
}
// class Test5 {
//    public static void main(String[] args) {
//        try {
//            throw new Exception("X");
//        } catch (RuntimeException e) {
//            System.out.println("A");
//        } finally {
//            System.out.println("B");
//        }
//        System.out.println("C");
//    }
//}