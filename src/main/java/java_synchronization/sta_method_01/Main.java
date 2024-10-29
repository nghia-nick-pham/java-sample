package java_synchronization.sta_method_01;

public class Main {
    public static void main(String arg[])
    {
        Display d1=new Display();
        Display d2=new Display();
        MyThread t1=new MyThread(d1,"Dhoni");
        MyThread t2=new MyThread(d2,"Yuvaraj");
        t1.start();
        t2.start();
    }

}
