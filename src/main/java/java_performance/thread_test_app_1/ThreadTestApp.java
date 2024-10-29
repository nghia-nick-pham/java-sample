package java_performance.thread_test_app_1;

import java.lang.reflect.Method;
import java.util.Set;

public class ThreadTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start instance of ModifiedThread, meantime we will check if it is justified thread
        ModifiedThread rc = new ModifiedThread();
        rc.setJustificationMessage("Info from a method - Created in ThreadTestApp.java line 22.");
        rc.setName("Info from Thread Name-Created in ThreadTestApp line 24.");
        rc.start();
        ThreadTestApp tta = new ThreadTestApp();
    }

    public ThreadTestApp() {
        System.out.println("Test code in the constructor");
        callAllJustificationMethods();
    }

    /**
     * Similar method could be used to read Justification message
     * for every one of the threads.
     * We have to attack it to some service or if not a web application
     * to use background Thread listening to file, port...
     */
    public void callAllJustificationMethods(){
         /*get all classes
         there are other faster ways, but if it has to be called just once during a problem.
        */
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for (Thread t : threadSet) {
            //variant A:
            System.out.println("Thread name:"+t.getName());
            /* Variant B - use it if you know the class of threads
            if(t instanceof ModifiedThread)
            {
                ModifiedThread m=(ModifiedThread)t;
                System.out.println("Id:"+m.getId() +"Name:"+ m.getName()+"Message"+m.getJustificationMessage());
            }
             */
            //variant C - use it when you do not know the exact class of the thread
            {
                boolean hasMethod = false;
                Method[] methods = t.getClass().getMethods();
                for (Method m : methods) {
                    //check if it has justification message:
                    if (m.getName().equals("getJustificationMessage"))  {
//                        System.out.println("t.getClass():"+t.getClass()+" m.getName():"+m.getName());
                        hasMethod = true;
//                        System.out.println("This is the method");
                        try {
                            //get justification method
                            Object result =  m.invoke(t);
                            System.out.println("result:"+(String)result);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                }
            }

        }
    }
}




