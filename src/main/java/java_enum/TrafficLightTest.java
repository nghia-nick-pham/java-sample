package java_enum;

import java_enum.enumdef.MessageStatusEnum;
import java_enum.enumdef.ResultStatusEnum;

/**
 * Created by NghiaPV on 8/31/2017.
 */
public class TrafficLightTest {

    public static void main(String[] args) {
//        for ( TrafficLight tl : TrafficLight.values()
//             ) {
//
//
//            System.out.println(tl.name());
//            System.out.println(tl.getSeconds());
//            System.out.println(tl.ordinal());
//            System.out.println(tl.toString());
//            System.out.println("----");
//
//        }

//        System.out.println("aaaaa");
//        TrafficLight t;
//
//        t = TrafficLight.valueOf(TrafficLight.class, "Yellow");
//        System.out.println(t);
//        System.out.println("aaaaa");
//
//        System.out.println("-----------------");
//        System.out.println(TrafficLight.Red.name());
//        System.out.println(TrafficLight.Red.getSeconds());
//        System.out.println(TrafficLight.Red.ordinal())

//        TrafficLight.Green
//          TrafficLight trafficLight =  TrafficLight.valueOf( "Yellow");
//          System.out.println(TrafficLight.Green.getSeconds());
//          System.out.println("TrafficLight.Green");
//          System.out.println(TrafficLight.Green);
//        MessageStatusEnum messageStatusEnum = MessageStatusEnum.valueOf("ERROR");
//        System.out.println(messageStatusEnum.getValue());

        System.out.println(ResultStatusEnum.SUCCESS);
        System.out.println("hello");

//        System.out.println(MessageStatusEnum.SUCCESS);
//        print(MessageStatusEnum.WARNING);

//        MessageStatusEnum messageStatusEnum1 = MessageStatusEnum.valueOf("error1");
//        System.out.println(messageStatusEnum1.getValue());
    }

    static void print(MessageStatusEnum messageStatusEnum){
        switch (messageStatusEnum){
            case INFO:
                System.out.println("This is Info ");
                break;
            case ERROR:
                System.out.println("This is Info ");
                break;
            default:
                System.out.println("This is Info default ");
                break;
        }

    }
}
