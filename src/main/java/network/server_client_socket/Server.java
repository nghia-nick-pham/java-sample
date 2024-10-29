package network.server_client_socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(7000);
        Socket socket = ss.accept();
        String abc = "a";
        ObjectInputStream ois = new ObjectInputStream(
                socket.getInputStream());
        int count=0;
        while(true) {
            Person p = (Person) ois.readObject();
            if (count++ % 1000 == 0) {
                System.out.println(p);
                System.out.printf("abc: " + abc);
            }
        }
    }
}
//https://www.javaspecialists.eu/archive/Issue088-Resetting-ObjectOutputStream.html
