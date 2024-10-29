package java_string;

public class TabReplaceTest {

    public static void main(String[] args) {
        String str1 = "\tHello FooBar";
        String str2 = "\tHello\tFooBar";
        String str3 = "\tHello\tFooBar\t";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("=======================");
        str1 = str1.replace("\t", "1111");
        str2 = str2.replace("\t", "1111");
        str3 = str3.replace("\t", "1111");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
