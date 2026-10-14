package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemClass {
    public static void main(String[] args) throws IOException {
//        System si=new System();

        System.err.println("hello");
        if(10>1)
        {
            System.out.println("greater");
        }
        int x=System.in.read();
        System.in.read();
        System.out.println(x);
        InputStreamReader ir=new InputStreamReader(System.in);// converts stream of bytes into stream of characters
        BufferedReader br=new BufferedReader(ir);
        int s=Integer.parseInt(br.readLine());
        System.out.println(s);
        System.out.println("enter your name");
        String name=br.readLine();
        System.out.println(name);


    }
}
// System class --> PrintStream out
// PrintStream --> println()

// err --> error
// out --> output

/*
1. Aditya -> i/p
2. OS BUffer (65, 100, 105, 116, 121, 97)
3. System.in (InputStream) recieves bytes
4. INputStreamReader --> stream of bytes into stream of characters
    ('A', 'd', 'i', 't', 'y', 'a')
5. BufferedReader --> readLine --> Aditya --> name
6. Aditya -> o/p
*/