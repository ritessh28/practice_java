package String;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // Create a few test strings
        String str1 = "Hello World";
        String str2 = new String("Unique String Object");
        String str3 = "Another String";

        System.out.println("Strings are created. Press ENTER in this console to exit...");

        // This pauses the program so it stays alive in memory
        new Scanner(System.in).nextLine();
    }
}
