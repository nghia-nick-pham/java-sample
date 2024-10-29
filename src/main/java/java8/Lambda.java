package java8;

/**
 * Created by nghiapv on 20/03/2017.
 */
public class Lambda {


    public static void main(String[] args) {
        PrintMessage printMessage = (String message1, String message2) -> {System.out.println(message1 + " and " + message2 );};
        printMessage.outMessage("Hello", "Thank you");
    }


    interface PrintMessage{
        void outMessage(String message1, String message2 );
    }
}
