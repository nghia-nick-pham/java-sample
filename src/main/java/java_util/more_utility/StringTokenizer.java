package java_util.more_utility;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class StringTokenizer {
    static String in = "name=Jim;age=;add=NewYork;";

    public static void main(String[] args) {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(in, "=;");

        while (stringTokenizer.hasMoreTokens()){
            String key = stringTokenizer.nextToken();
            String val = stringTokenizer.nextToken();
            System.out.println(key + "/" + val);
        }
    }
}
