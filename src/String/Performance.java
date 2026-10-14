package String;

public class Performance {
    public static void main(String[]args) {
        String series="";
        for(int i=0;i<29;i++)
        {

            series=series+(char)('a'+i);
            System.out.println(series+" ");

        }
        System.out.println(series);

    }
}
