package java_library.stringBuffer;

/**
 * Created by nghiapv on 26/03/2017.
 */
public class Append {
    public static void main(String[] args) {
        String s;
        String s1 = "he";
        String s2 = "llo";
        int a = 42;
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

//        s = s1.concat(s2);
//        s = sb.append(a).append(a).toString();
        s = sb.append("a = ").append(a).append("!").append("blahblahblahblah").toString();
        System.out.println(s);

    }
}
