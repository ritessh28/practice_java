package String;

public class SpecialAndCharCount {
    static void main(String[] args) {
        String s="18900AA@@!11";
        int charCount=0;
        int splCunt=0;
        for(char c:s.toCharArray())
        {
            if(((c>='a'&& c<='z')||(c>='A'&& c<='Z'))||(c>='0'&&c<='9'))
            {
                charCount++;
            }
            else
                splCunt++;
        }
        System.out.println(charCount+splCunt);
        double d=charCount/splCunt;
        System.out.println(splCunt);
        System.out.println(d);
    }
}
