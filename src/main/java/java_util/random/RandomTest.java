package java_util.random;

/**
 * Created by NghiaPV on 9/26/2018.
 */
public class RandomTest {

    public static void main(String[] args) {

        //generate()


        System.out.println(String.valueOf(System.currentTimeMillis()));


    }

    public static void generate(){
        for (int i = 0; i < 20; i++) {
            System.out.println(getRandom(500));
        }
    }

    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }


}
