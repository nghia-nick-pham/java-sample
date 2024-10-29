package thread.process_cmd;

import java.io.*;

public class ProcessCMD {
    static void copy(InputStream in, OutputStream out) throws IOException {
        while (true) {
            int c = in.read();
            if (c == -1)
                break;
            out.write((char) c);
        }
    }

//    public static void main(String[] args) throws Exception {
//        Process p = null;
//
//        try {
//            p = Runtime.getRuntime().exec("cmd.exe //c mvn install:install-file -Dfile=D://idw_modernize//src//lib//acme.jar -DgroupId=com.unknown.lib -DartifactId=acme -Dversion=1.0.0 -Dpackaging=jar");
//        } catch (IOException e) {
//            System.err.println("Error on exec() method");
//            e.printStackTrace();
//        }
//
//        copy(p.getInputStream(), System.out);
//        p.waitFor();
//    }

    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
//                "cmd.exe", "/c", "cd \"C:\\Program Files\" && dir && mvn -version && java -version");
//                "cmd.exe", "/c", "mvn -version");
                "cmd.exe", "/c", "mvn install:install-file -Dfile=D://idw_modernize//src//lib//acme.jar -DgroupId=com.unknown.lib -DartifactId=acme -Dversion=1.0.0 -Dpackaging=jar" +
                " && mvn install:install-file -Dfile=D://idw_modernize//src//lib//xmlbeans-2.6.0.jar -DgroupId=org.apache.xmlbeans -DartifactId=xmlbeans -Dversion=2.6.0 -Dpackaging=jar" );
//                "cmd.exe", "/c", "cd \"C:\\Program Files\" ", " & dir ", " & mvn -version");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}
