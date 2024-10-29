package java_util.collection;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by nghiapv on 02/04/2017.
 */
public class Queue_01 {

    public static void main(String[] args) {
        BlockingQueue queue=new ArrayBlockingQueue(3);
//        Queue queue = null;

//        queue.offer("Monday");
//        queue.offer("Tuesday");
//        boolean flag = queue.offer("Wednesday");
//        System.out.println("Whether adding Wednesday to queue: " + flag);

//        try{
//            queue.add("Thursday");
//            queue.add("Monday");
//            queue.add("Tuesday");
//            queue.add("Wednesday");
//        }catch (IllegalStateException e){
//            e.printStackTrace();
//        }

        queue.offer("Thursday");
        queue.offer("Monday");
        queue.offer("Tuesday");
        queue.offer("Wednesday");
        System.out.println(queue);



//        Object head = null;
//        try {
//            head = queue.remove();
//            System.out.println("Remove element: " + head.toString());
//            System.out.println("Now the first element: " + queue.element());
////            queue.remove();
////            queue.remove();
//        }catch (IllegalStateException e){
//            e.printStackTrace();
//        }
//
//        head = queue.poll();
//        System.out.println("Remove element " + head.toString());
//        System.out.println("Now the first element" + queue.peek());
    }
}
