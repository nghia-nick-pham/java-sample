package java_string.input_stream.others;

import java.io.*;

public class InputStreamProcessTest {
    public void processInputStream(InputStream inputStream) throws IOException {
//        inputStream.mark(0);  // Mark the position at the beginning of the stream
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        System.out.println("First Function: " + line);

//        inputStream.reset();  // Reset to the marked position
    }

    public void anotherFunction(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();  // Now it will work since the stream is reset
        System.out.println("Second Function: " + line);
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("Hello, World! \n Hey, how r u".getBytes());

        InputStreamProcessTest inputStreamProcessTest = new InputStreamProcessTest();

        inputStreamProcessTest.processInputStream(inputStream);  // Prints: Hello, World!
        inputStreamProcessTest.anotherFunction(inputStream);     // Prints: Hello, World!
    }

}
