package java_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by NghiaPV on 1/2/2018.
 */
public class Main {

    public static void main(String[] args) {
        Class<?> concreteClass = ConcreteClass.class;
//        concreteClass = new ConcreteClass().getClass();

//        try {
//            // below method is used most of the times in frameworks like JUnit
//            //Spring dependency injection, Tomcat web container
//            //Eclipse auto completion of method names, hibernate, Struts2 etc.
//            //because ConcreteClass is not available at compile time
////            concreteClass = Class.forName("java_reflection.ConcreteClass");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(concreteClass.getCanonicalName()); // prints com.journaldev.reflection.ConcreteClass
//        System.out.println(Modifier.toString(concreteClass.getModifiers()));
//        Field[] publicFields = concreteClass.getFields();
//        System.out.println(Arrays.toString(publicFields));
        try {
//            Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
//            Map<String, String> hm = new HashMap<>();
//            method.invoke(hm, "key1", "value1");
//            System.out.println(hm);

            Field privateField = Class.forName("java_reflection.ConcreteClass").getDeclaredField("privateString");
//turning off access check with below method call
            privateField.setAccessible(true);
            ConcreteClass objTest = new ConcreteClass(1);
            System.out.println(privateField.get(objTest));
            privateField.set(objTest, "private string updated");
            System.out.println(privateField.get(objTest));
        }catch (Exception ex){
            ex.printStackTrace();
        }
                //for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName()); // prints boolean



    }
}
