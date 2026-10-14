package String;

public class CountOfChar {
    public static void main(String[] args) {
        String str="abxbdjkdaaabza";
        int count=0;
        for(char c:str.toCharArray())
        {
            if(c=='a')
            {
                count++;
            }
        }
        System.out.println("count is"+count);
    }
}
