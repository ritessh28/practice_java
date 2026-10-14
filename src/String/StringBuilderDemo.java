package String;

public class StringBuilderDemo {
    static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");
        sb.append((String) null);
        sb.append(1+2);
        System.out.println(sb);
        System.out.println(sb);
        sb.insert(0,'x'+1);
//                               012345678910
        System.out.println(sb);//121abcdednull3
        sb.delete(2,100);
        System.out.println(sb);//12

    }

}
