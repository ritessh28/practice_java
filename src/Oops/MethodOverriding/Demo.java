package Oops.MethodOverriding;
import java.io.IOException;

class DatabaseConnector {
    public static int connectionCount = 0;

    // Instance Block
    {
        System.out.println("Initializing DB connection...");
        if (connectionCount > 0) {
            throw new IOException("Connection pool limit reached!");
        }
        connectionCount++;
    }

    public DatabaseConnector() throws IOException {
        System.out.println("DatabaseConnector created.");
    }

    public static void printStatus() {
        System.out.println("Status: Generic Database Connected");
    }
}

class SecureConnector extends DatabaseConnector {

    public SecureConnector() throws IOException {
        System.out.println("SecureConnector created.");
    }

    // Attempting to hide the static method
    public static void printStatus() {
        System.out.println("Status: SECURE Database Connected");
    }
}

public class Demo {
    public static void main(String[] args) {
        try {
            DatabaseConnector db = new SecureConnector();
            SecureConnector sc=new SecureConnector();
            db.printStatus();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
