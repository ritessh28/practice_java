package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception21 {
    public static void main(String[] args)
    {
        try(BufferedReader br=new BufferedReader(new FileReader("demo.txt")))
        {
//             br=new BufferedReader(new FileReader("new.txt"));
            //as in the try with resources by default the object there are final so
            // autocloseable resources may not be reassigment the above assignment is invalid
        } catch (IOException e) {
//            System.out.println(e);
            e.printStackTrace();
        }

    }
}
