package java_recursive;

public class Sample1 {


    static String recursive(String name, int index) {
        if (index < 5) {
            System.out.println(index);
            return recursive("", ++index);
        }
        return "";
    }


    public static void main(String[] args) {
        int index = 1;
        recursive("", index);

    }
}
