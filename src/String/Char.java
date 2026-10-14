package String;

public class Char {
    public static void main(String[] args) {
        char []ch={'1','a','b','a'};
        System.out.println(ch[0]>ch[1]);
//        System.out.println(byte(ch[0]));
        byte b=(byte) ch[0];
        System.out.println(b);
        System.out.println(ch[1]==ch[3]);
//        ch.notifyAll();
    }
}
