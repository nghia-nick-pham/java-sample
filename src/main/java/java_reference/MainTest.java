package java_reference;

import model.User;

/**
 * Created by NghiaPV on 3/29/2018.
 */
public class MainTest {
    public static void main(String[] args) {
        User user1 = null;
//        User user1 = new User();
//        user1.setFirstName("myFirstNameOld");
//        user1.setAge(1);
//        System.out.println(user1.getFirstName());
        changeValueInput(user1);
        System.out.println(user1.getFirstName());

    }
    private static void changeValueInput(User user){
//        a++;
        user = new User();
        user.setFirstName("myFirstNameChanged");
        System.out.println(user.getFirstName());
    }
}
