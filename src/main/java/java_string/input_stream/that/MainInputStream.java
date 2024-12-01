package java_string.input_stream.that;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MainInputStream {

    public static void main(String[] args) {
        byte[] bytes;
        ByteArrayInputStream bis;
        ReplacingInputStream ris;
        InputStream is;
        ByteArrayOutputStream bos;
        try {
//            bytes = "hello xyz world.".getBytes("UTF-8");
            InputStream inputStream = new FileInputStream("src/main/resources/file/InputStreamSample.txt");

//            ris = new ReplacingInputStream(bis, "/liteca-be-LITECA-582/api/images/", "");
            is = new ReplacingInputStream(inputStream, "/liteca-be-LITECA-582/api/images/", "");
            bos = new ByteArrayOutputStream();

            int b;
            while (-1 != (b = is.read()))
                bos.write(b);

//            assertEquals("hello  world.", bos.toString());
            System.out.println(bos.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
