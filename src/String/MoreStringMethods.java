package String;

import java.util.Arrays;

public class MoreStringMethods {
    public static  void main(String[] args) {
        String s="  ritesh   shetty  ";
        String s2="learning strings";
        String s3="abcdadca";
//                 01234567
        String s4="  ";
        String s5="ritesh";
        String s6="ritesh";
        String s7="RITESH";
        StringBuffer sb=new StringBuffer("ritesh");
        System.out.println(s.trim());// removes leading and trailing white spaces first and last white space
        System.out.println(s.strip());// same as trim but also removes unicode whitespaces
        System.out.println(s.replace("  ",""));// replace a char with specific char
        System.out.println(Arrays.toString(s.trim().split("\\s+")));
        //converts a string into an array of string on the basis of value we provide in parameters
        String [] str=s.trim().split(" ");
        System.out.println(Arrays.toString(str));
        System.out.println(str[0]);
        String sr=str.toString();
        // we cannot convert array of string into string using toString if we do it stores object values
        System.out.println("%%%%%%%%%%");
        System.out.println(sr);//here it prints object value
        System.out.println(sr.charAt(1));
        System.out.println(str.length);
        System.out.println(Arrays.toString(str));
        System.out.println("&&&&&&&&&&&&&&");
        System.out.println(String.join("*", new String[]{"1", "2", "3", "4"}));
        System.out.println(String.join("-","1","2","3"));
        String arrayStringData=String.join(" ",s2.split(" "));
        // join can be used to convert String Array to String
        System.out.println(arrayStringData);
        byte []b=s2.getBytes();// get Unicode value of each character in a string
        char []ch=s2.toCharArray();// get each char values of a string converts it into a char array
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(s2.split(" ", 0)));
//        System.out.println(s2.indexOf(s, Integer.parseInt("4")));
        System.out.println(s2.indexOf("r"));
        System.out.println(s3.lastIndexOf("a"));
        System.out.println(s3.indexOf("a"));
        System.out.println(s3.replace("a","!"));
        System.out.println(s3.replaceFirst("a","@"));
        System.out.println(s3.replaceAll("abc","@**"));
        System.out.println(s4.isBlank());
        System.out.println(s4.isEmpty());
        System.out.println(s5==s6);
        System.out.println(s6==s7);
        System.out.println(s5.equals(s6));
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s5.compareTo(s6));
        System.out.println(s5.compareTo(s7));
        System.out.println("pppppppppppppp");
        System.out.println(s2.codePointAt(1));// returns the unicode value of a index
        System.out.println(s2.codePointBefore(2));//before
        System.out.println(s2.concat(s3));
        System.out.println(s+10);
        System.out.println(10+20+s2);
        System.out.println(s.matches(s2));
        System.out.println(s5.matches(s6));
        System.out.println(s5.matches(s7));
        System.out.println(s2.contains("l"));
        System.out.println(s2.contains("rm"));
        System.out.println(s5.contentEquals(s6));
        System.out.println(s5.contentEquals(s7));
        System.out.println(s5.contentEquals(sb));
        System.out.println(s2.startsWith("lear"));
        System.out.println(s2.endsWith("s"));
        System.out.println(s3.lastIndexOf("a"));
        System.out.println(s2.startsWith("rm"));
        System.out.println(s2.substring(2));
        System.out.println(s2.substring(2,5));
        System.out.println(s2.substring(5));
        System.out.println(s2.subSequence(0,5));
        CharSequence sm=s2.subSequence(0,5);
        System.out.println(sm);
        System.out.println(s2.hashCode());
        System.out.println(String.valueOf(10));
        String r1=String.valueOf(str);
        System.out.println(r1);
        char []st={'1','2','3','4'};
        String r2=String.valueOf(st);
        System.out.println(r2);
//        System.out.println();
        String r3="javafun";
        r3.getChars(0,2,st,0);
        // getChars() basically gets the specified characters from a string a store it in the provided character array
        System.out.println(st);
        String str1="helloguys";
        char []cm=new char[10];
        str1.getChars(0,4,cm,1);
        System.out.println(Arrays.toString(cm));



    }
}
