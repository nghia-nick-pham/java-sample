package java_resource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NghiaPV on 3/29/2018.
 */
public class MyResource {

    FileInputStream fileInputStream;
    BufferedReader reader;

    public BufferedReader getReader() {
        return reader;
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public void readFileInputStream(){

        FileInputStream fis = null;
        BufferedReader reader = null;
        try{
            fis = new FileInputStream("C:\\Users\\T450\\Documents\\Log\\201803w2\\empty.txt");
            reader = new BufferedReader(new InputStreamReader(fis));
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
            }

            this.reader = reader;
        }catch (Exception e){

        }finally {
            try {
                if (reader != null) reader.close();
            } catch(IOException e){

            }
        }

    }

}
