package java_generic;

import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NghiaPV on 1/7/2018.
 */
public class GenericsTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        Object lObj = new Object();
        List<User> lUser = new ArrayList<>();
        User user = new User();
        user = (User) lObj;


        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Pankaj");
        String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
        System.out.println(str);

        List list = new ArrayList();
        list.add("abc");
        list.add(new Integer(5)); //OK

        for (Object obj : list) {
            //type casting leading to ClassCastException at runtime
            String str1 = (String) obj;
            System.out.println(str1);
        }
    }
}
