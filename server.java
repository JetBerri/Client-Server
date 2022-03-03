import java.net.*;
import java.io.*;

public class server{
    public static void main(String[] args) throws IOException{
        System.out.println("Waiting for incoming connection...");
        try (ServerSocket ss = new ServerSocket(8080)) {
            Socket s = ss.accept();
        
        System.out.println("Client succesfully connected!");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader buffer = new BufferedReader(in);

        String str = buffer.readLine();
        System.out.println("Client: " + str);

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.print("Connected.");
        pw.flush();

        }
    }
}