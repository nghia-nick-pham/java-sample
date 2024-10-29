package java_general.urlclassloader;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
//        ArrayList classpath = new ArrayList();
//        classpath.add("file:D:\\Programming\\Sample\\JavaCore\\java_core_01\\src\\main\\resources\\MailChecker.jar");
//
//        String mainClass = getMainClass();
//        System.out.println("Main-Class: " + mainClass);
//        URL jarUrl = new URL("file:D:\\Programming\\Sample\\JavaCore\\java_core_01\\src\\main\\resources\\MailChecker.jar");
//
////        URL[] abc = (URL[]) classpath.toArray(new URL[classpath.size()]);
//        URL[] urls = new URL[]{jarUrl};
//
////        URL[] abc = (URL[]) classpath.toArray(new URL[classpath.size()]);
////        System.out.println(abc);
////        Class main = new URLClassLoader((URL[]) classpath.toArray(new URL[classpath.size()]), null).loadClass("mailcheck.MailChecker");
////        Method t = new URLClassLoader((URL[]) classpath.toArray(new URL[classpath.size()]), null).loadClass("mailcheck.MailChecker").getMethod("processFooBar", String.class);
////        Method t = new URLClassLoader(urls, null).loadClass("mailcheck.MailChecker").getMethod("processFooBar", String.class);
////        Class<?> c = new URLClassLoader(urls, null).loadClass("mailcheck.MailChecker");
////         c.getDeclaredMethods();
////        Method t = new URLClassLoader(urls, null).loadClass("mailcheck.MailChecker").getMethod("processFooBar", String.class);
////        Method t = new URLClassLoader(urls, null).loadClass("mailcheck.MailChecker").getMethod("main", new Class[]{String[].class});
//        Object rv = t.invoke(null, "test");
//        System.out.println(rv);
    }

    private static String getMainClass() {
        String userMainClass = System.getProperty("MainClass");
        return isEmpty(userMainClass) ? "Main" : userMainClass;
    }

    public static boolean isEmpty(String o) {
        return o == null || o.length() == 0;
    }
}
