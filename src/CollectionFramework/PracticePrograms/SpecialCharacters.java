package CollectionFramework.PracticePrograms;

public class SpecialCharacters {
    public static void main(String[] args) {
        String s="aav08900**())";
        int alphacount=0,digitCount=0,specialCount=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z'))
            {
                alphacount++;
            }
            else if((s.charAt(i)>='0'&&s.charAt(i)<='9'))
                digitCount++;
            else
                specialCount++;
        }
        System.out.println("alphabet count is:"+alphacount);
        System.out.println("digit count is:"+digitCount);
        System.out.println("special count is:"+specialCount);


    }


}
