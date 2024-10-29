package java_library.string;

/**
 * Created by nghiapv on 26/03/2017.
 */
public class Testing {
    public static void main(String[] args) {
        String s = "This is a test";
        String result = "";
        String[] splited = s.split(" ");

        for (int i = splited.length - 1; i >= 0; i--){
            result += splited[i] + " ";
        }

        System.out.println(result);
    }
}
