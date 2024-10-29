package network;

import java.net.InetAddress;

/**
 * Created by nghiapv on 03/04/2017.
 */
public class InetAddress_01 {
    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();

        System.out.println(inetAddress);

        inetAddress = InetAddress.getByName("www.facebook.com");
        System.out.println(inetAddress);

        InetAddress[] SW = InetAddress.getAllByName("www.facebook.com");
        for (InetAddress ia: SW
             ) {
            System.out.println(ia);
        }
    }
}
