package String;

public class EmptyOrNull {
    public static void main(String[] args) {
        String str=new String("java");
        String str2=" ";
        String str3=null;
        System.out.println(str.isEmpty());
        System.out.println(isEmptyorNull(str2));
        System.out.println(isEmptyorNull(str3));

    }
    public static boolean isEmptyorNull(String str)
    {
        return str==null||str.isBlank();
    }

}
