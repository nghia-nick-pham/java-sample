package java_string.input_stream;

import java.io.*;

public class ReplaceFilterInputStream extends FilterInputStream {
    private final String search;
    private final String replacement;
    private final StringBuilder buffer = new StringBuilder();
    private int bufferIndex = 0;

    protected ReplaceFilterInputStream(InputStream in, String search, String replacement) {
        super(in);
        this.search = search;
        this.replacement = replacement;
    }

    @Override
    public int read() throws IOException {
        if (bufferIndex < buffer.length()) {
            return buffer.charAt(bufferIndex++);
        }

        int nextChar = super.read();
        if (nextChar == -1) {
            return -1;
        }

        buffer.append((char) nextChar);
        if (buffer.toString().endsWith(search)) {
            buffer.replace(buffer.length() - search.length(), buffer.length(), replacement);
        }

        bufferIndex = 1;
        return buffer.charAt(0);
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new ByteArrayInputStream("This is a test string".getBytes());
        ReplaceFilterInputStream replaceStream = new ReplaceFilterInputStream(inputStream, "test", "sample");

        BufferedReader reader = new BufferedReader(new InputStreamReader(replaceStream));
        String line = reader.readLine();
        System.out.println(line); // Output: This is a sample string
    }

}
