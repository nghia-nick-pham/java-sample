package java_string;

import other.model.Customer;

import java.lang.reflect.Field;
import java.util.Locale;

public class UpperCaseTest {

    public static final String consCustomerName = "Lý Hiển Long";
    public static final String consCustomerNameUpper = "LY HIEN LONG";


    public static void main(String[] args) {
        Customer customer = new Customer(1, consCustomerName,50);

        customer.setName(customer.getName().toUpperCase(Locale.ENGLISH));

//        System.out.println(customer.getName().toUpperCase(Locale.ENGLISH));
        System.out.println(customer.getName());

//        getReflectiopn(customer, Customer.class);

    }

    public static  <T> T getReflectiopn(Object object, Class<T> clzz){
        try {
//            Class<Customer> customerObj = new Class<Customer>(Customer.class);
            Field field = clzz.getDeclaredField("name");
            field.setAccessible(true);
            if(consCustomerNameUpper.equals(field.get(object)) ){
                System.out.println("asserted!!!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return (T) new Object();
    }
}
