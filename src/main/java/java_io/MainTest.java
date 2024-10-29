package java_io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by NghiaPV on 10/15/2018.
 */
public class MainTest {

    public static void main(String[] args) {
        try {
            writeReadByFileUtils() ;
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }


    //https://www.baeldung.com/java-write-to-file
    public static void writeReadByFileUtils() throws IOException{

        String strWrite = "Hello File Util";

        //1. Path
        Path path =  Paths.get("E:\\Programming\\Sample\\JavaCore\\java_core_01\\src\\Main\\resources\\file\\iotest.txt");

        //2. content:  Convert to byte
        byte[] byteWrite = strWrite.getBytes();

        Files.write(path, byteWrite);


        String strRead = Files.readAllLines(path).get(0);

        System.out.println(strWrite.compareToIgnoreCase(strRead));
    }
}
