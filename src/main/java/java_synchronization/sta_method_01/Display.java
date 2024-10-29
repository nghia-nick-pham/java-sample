package java_synchronization.sta_method_01;

public class Display {
    public void wish(String name)
    {
        wishSub(name);
//        for(int i=0;i<3;i++)
//        {
//            System.out.print("Good Morning: ");
//            System.out.println(name);
//            try{
//                Thread.sleep(2000);
//            }
//            catch(InterruptedException e)
//            {
//            }
//        }
    }

    private static  synchronized void wishSub(String name){
        for(int i=0;i<3;i++)
        {
            System.out.print("Good Morning: ");
            System.out.println(name);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            }
        }
    }
}
