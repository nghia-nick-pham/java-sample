package java_string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text4 {

    private static final String REG_EXP_IMG_SRC = "<img .*src=\"(\\S+).gif";

    public static void main(String[] args) {
        String htmlMsg1 = "<img id=\"4cd85eff-2df3-477c-bba4-d84007348a51\" src=\"400.gif\" style=\"\" align=\"inline\" class=\"normal-image ProseMirror-normal-image\">";
        String htmlMsg2 = "<img src=\"400.gif\" style=\"\" align=\"inline\" class=\"normal-image ProseMirror-normal-image\">";
        Pattern pattern = Pattern.compile(REG_EXP_IMG_SRC);
        Matcher matcher1 = pattern.matcher(htmlMsg1);
        Matcher matcher2 = pattern.matcher(htmlMsg2);

        while (matcher1.find()) {
            System.out.println("matcher1.group(1)");
            System.out.println(matcher1.group(1));
        }

        while (matcher2.find()) {
            System.out.println("matcher2.group(1)");
            System.out.println(matcher2.group(1));
        }
    }
}
