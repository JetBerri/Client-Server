import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] args) throws IOException{
        try (Socket s = new Socket("127.0.0.1",8080)) {
            PrintWriter w = new PrintWriter(s.getOutputStream());

            w.println("Message from client.");
            ((Flushable) w).flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader buffer = new BufferedReader(in);

        String str = buffer.readLine();
        System.out.println("Server: " + str);
        }
    }
}
