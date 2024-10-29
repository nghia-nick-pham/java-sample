package java_string.regex;

public class Other {
    public static void main(String[] args) {
        String input = "0%1%2%3";
        System.out.println(checkUndecodeValue(input)); //true
        input = "%%";
        System.out.println(checkUndecodeValue(input)); //false
        input = "";
        System.out.println(checkUndecodeValue(input)); //false
    }

    static boolean checkUndecodeValue(String str){
        String regex = ".*\\%.*\\%.*\\%.*";
        return str.matches(regex);
    }
}
