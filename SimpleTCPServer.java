import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleTCPServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        ServerSocket serverSocket = null;
        Socket clientSocket = null; // Declare clientSocket outside the try block

        try{
            serverSocket = new ServerSocket(port);
            System.out.println("Server started. Listening on port " + port);
            
            while (true) {
                clientSocket = serverSocket.accept(); // Assign clientSocket inside the loop
                System.out.println(" Client connected from" + clientSocket.getInetAddress());
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                String inputLine = in.readLine();
                out.println("Echo from server" + inputLine);
                clientSocket.close();
                System.out.println("Client disconnected");
            }

        } catch (Exception e) {
            e.printStackTrace();
            if (clientSocket!= null) { // Check if clientSocket is not null before closing
                clientSocket.close();
            }
        } finally {
            if (serverSocket!= null) { // Check if serverSocket is not null before closing
                serverSocket.close();
            }
        }
    } 
}