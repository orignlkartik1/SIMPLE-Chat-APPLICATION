import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args){
        int port=5000;
        try(ServerSocket serversocket=new ServerSocket(port)){
            System.out.println("Server is running on port"+port);
            Socket socket=serversocket.accept();
            System.out.println("Client connected!");

            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream(),true);

            String message;

            while((message=input.readLine())!=null){
                System.out.println("Client :"+message);
                output.println("Server received :"+message);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
