package lab5simpleserver;


import java.io.IOException; 
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author dominiclanza
 */
public class client {
    public static void main(String args[]) throws UnknownHostException, IOException
    {
        String string1, string2;
        StringBuilder stringB = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 9876); //remember port number here, used to create server socket
        Scanner scanner1 = new Scanner(s.getInputStream());
        System.out.println("Enter a STRING");
        string1 = sc.nextLine();

        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(string1);

        string2 = scanner1.nextLine();
        System.out.println(string2);
    }
}
