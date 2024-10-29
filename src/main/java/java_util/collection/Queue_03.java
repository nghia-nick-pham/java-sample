package java_util.collection;

import com.sun.javafx.scene.control.skin.ComboBoxPopupControl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class Queue_03 {

    public static class IdComparator implements Comparator<Customer>{
        @Override
        public int compare(Customer o1, Customer o2) {
            return (int) o1.getId() - o2.getId();
        }
    }

    public static void main(String[] args) {
        Comparator<Customer> comparator = new IdComparator();
        Queue<Customer> queue = new PriorityQueue<Customer>(7, comparator);
        Random random = new Random();

        for(int i = 0; i < 7; i++){
            int randVal = random.nextInt(10);
            queue.add(new Customer(randVal,"Jimmy" + randVal));
        }

        while (true){
            Customer cust = queue.poll();
            if(cust == null)
                break;
            System.out.println(cust.getId());

        }

//        for(Customer cust : queue){
//            System.out.println(cust.getId());
//        }
    }

}
