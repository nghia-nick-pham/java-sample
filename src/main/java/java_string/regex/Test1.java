package java_string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {

//        int start, end;
//        String regexWord = ("[\\p{L}0-9'-]+");
//        String regexLetter = "[^a-zA-Z \n]";
//        String oriSentence = "\n" +
//                "----- Original Message -----\n" +
//                "From: < TEST@IMX.FR >\n" +
//                "To: < NVPHAM@CODIX.EU >\n" +
//                "Sent: < Mardi, Novembre 10, 2020 06:26 AM >\n" +
//                "Subject: < Test Mail 01 >\n" +
//                "\n" +
//                " Test Mail 01";
//
//// step 1: filter
//        String newSentence = oriSentence.replaceAll(regexLetter, " ");
//
//// step 2: seperate word
//
////        System.out.println("-----".indexOf(oriSentence));
//
//
////        System.out.println(sentence);
////        System.out.println("--------------");
//////        System.out.println(sentence.replaceAll("[^a-zA-Z \n]", "")); //java
////        String newSentence = oriSentence.replaceAll("[^a-zA-Z \n]", "");
//        Pattern pp = Pattern.compile(regexWord);
//        Matcher mm = pp.matcher(newSentence);
////
//        while (mm.find()) {
//            start = mm.start();
//            end = mm.end();
//            String word = newSentence.substring(start, end);
//            System.out.println("--------------------");
//            System.out.println(word);
//            System.out.println(start);
//            System.out.println(end);
//
//        }

//        final String regex = ".*RC_(\\d+)(\\s|$).*";
//        Pattern pattern = Pattern.compile(regex);
////        Matcher matcher = pattern.matcher();
//        pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher("Subject mail RC_123456789 for testing");
//        if(matcher.matches())
//        System.out.println(matcher.group(1));
        String prefix_individual = "RC_";
        final String regex = ".*" + prefix_individual + "(\\d+)(\\s|$).*";
        final String regex2 = ".*RC_(\\d+)(\\s|$).*";
        final String regex3 = String.valueOf(new StringBuilder().append(".*").append(prefix_individual).append("(\\d+)(\\s|$).*"));
        System.out.println("regex: ");
        System.out.println(regex);
        System.out.println("regex 2: ");
        System.out.println(regex2);
        System.out.println("regex 3: ");
        System.out.println(regex3);
    }
}
