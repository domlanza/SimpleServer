package lab5simpleserver;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.ServerSocket;


public class server {
      public static void main(String args[]) throws IOException
    {
        String string1, string2;
        StringBuilder stringB = new StringBuilder();

        ServerSocket s1 = new ServerSocket(9876); 

        Socket servSocket = s1.accept();
        Scanner scanner = new Scanner(servSocket.getInputStream());
        string1 = scanner.nextLine();

        stringB.append(string1);
        stringB = stringB.reverse();

        PrintStream p = new PrintStream(servSocket.getOutputStream());
        p.println(stringB);

    }
}

