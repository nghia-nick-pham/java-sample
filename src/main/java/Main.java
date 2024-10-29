import java_class.CurrentClass;

import java.io.File;

/**
 * Created by nghiapv on 08/03/2017.
 */
public class Main {
    public static void main(String[] args) {
//        IdentifyMyParts a = new IdentifyMyParts();
//        IdentifyMyParts b = new IdentifyMyParts();
//        a.y = 5;
//        b.y = 6;
////        a.x = 1;
////        b.x = 2;
//        System.out.println("a.y = " + a.y);
//        System.out.println("b.y = " + b.y);
//        System.out.println("a.x = " + a.x);
//        System.out.println("b.x = " + b.x);
//        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

//        System.out.println(CurrentClass.class.getSuperclass().getSuperclass().getSimpleName());
//        System.out.println("System Java Home : " + System.getenv("JAVA_HOME"));
//        String refText = "A7005GCE";
//        System.out.println(refText.charAt(5));
//        System.out.println(refText.charAt(6));
//        System.out.println(refText.charAt(7));
//        System.out.println(File.separator);
//        System.out.println(File.separatorChar);

//
//                int n;
//                for(n=1;n<=16;n++)
//                {
//                    if(n==5)
//                        break;
//                    System.out.printf("%d",n);
//                }


//          int a = 5;
//
//          if (a > 5){
//              System.out.printf("a > 5");
//          } else if (a == 6){
//              System.out.printf("a = 5");
//          } else if (a < 6){
//              System.out.printf("a < 6");
//          }

//            String strA = "strA";
//            String strB = strA;
//            strA = null;
//
//        System.out.printf(strB);
//        String crosheText = "[r[BEGINIGNOREABC[ENDIGNORE[XFPROP[XFSIZE10[XPT[XVUP30[XVDOWN255[XTP[XV265[XX<<variab_footer>>[XV15[XX<<variab_header>>[XV47[Xtp";
//
//        int ind_begin_ignore = crosheText.indexOf("[BEGINIGNORE");
//        int ind_end_ignore = crosheText.indexOf("[ENDIGNORE");
//        if (ind_begin_ignore != -1 && ind_end_ignore != -1  ) {
//            String ignoreText = crosheText.substring(ind_begin_ignore + "[BEGINIGNORE".length(), ind_end_ignore);
////            metaDataPanel.setText(ignoreText);
//            crosheText = crosheText.substring(0, ind_begin_ignore) +
//                    (crosheText.length() > ind_end_ignore + "[ENDIGNORE".length() ? crosheText.substring(ind_end_ignore+"[ENDIGNORE".length()) : "");
//        }
//        System.out.println(crosheText);

        System.out.println("Java runtime version: " + System.getProperty("java.runtime.version" ));
        System.out.println("Java runtime version: " + System.getProperty("java.class.path"));


        }

}
