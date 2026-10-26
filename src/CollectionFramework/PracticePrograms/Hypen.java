package CollectionFramework.PracticePrograms;

public class Hypen {
    public static void main(String[] args) {
        String s="jabajsk";
        char []arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
//
                arr[i]='-';

        }
        String ans=String.valueOf(arr);
        System.out.println(ans);
    }
}
