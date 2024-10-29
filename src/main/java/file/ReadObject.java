package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

/**
 * Created by NghiaPV on 2/4/2018.
 */
public class ReadObject {

    public static void main(String[] args) {

        ReadObject obj = new ReadObject();

        Map<String, Object> mapObj = obj.deserialzeAddress("C:\\Users\\T450\\AppData\\Local\\Packages\\Microsoft.SkypeApp_kzf8qxf38zg5c\\LocalState\\Downloads\\SESSIONS.ser");




    }

    public Map<String, Object> deserialzeAddress(String filename) {

        Map<String, Object> address = null;

        FileInputStream fin = null;
        ObjectInputStream ois = null;

        try {

            fin = new FileInputStream(filename);
            ois = new ObjectInputStream(fin);
            Object address1 =  ois.readObject();

            System.out.println(address1.toString());
            System.out.println(address1.getClass());

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return address;

    }
}
