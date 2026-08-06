package String;

public class Stringbuilder {
    public static void main(String[]args)
    {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<25;i++)
        {
            builder.append((char)('a'+i));
            System.out.println(builder);
        }
        int []arr={5,10,16};
        builder.append(6);
        System.out.println(builder);
        builder.delete(1,2);
        System.out.println(builder);
        System.out.println(builder.indexOf("s"));
//        builder.insert();
        System.out.println(builder.substring(2));


    }
}
