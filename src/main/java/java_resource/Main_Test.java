package java_resource;

import java.io.BufferedReader;
import java.io.FileInputStream;

/**
 * Created by NghiaPV on 3/29/2018.
 */
public class Main_Test {

    public static void main(String[] args) {
        try{
            MyResource myResource = new MyResource();
            myResource.readFileInputStream();
            BufferedReader br = null;
            br = myResource.getReader();
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                out.append(line);
            }
            System.out.println("done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
