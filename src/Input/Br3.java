package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Br3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter True or False");
        Boolean b=Boolean.parseBoolean(br.readLine());
        System.out.println(b);
        System.out.println("enter floating value");
        float f=Float.parseFloat(br.readLine());
        System.out.println(f);
        System.out.println((22.45+f));

    }
}
