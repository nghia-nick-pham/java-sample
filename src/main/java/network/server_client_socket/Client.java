package network.server_client_socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        Socket s = new Socket("localhost", 7000);
        ObjectOutputStream oos = new ObjectOutputStream(
                s.getOutputStream());
        Person p = new Person("Heinz", "Kabutz", 0);
        for (int age=0; age < 5; age++) {
            p.setAge(age);
            oos.writeObject(p);
        }
        long end = System.currentTimeMillis();
        System.out.println("That took " + (end-start) + "ms");
    }
}
