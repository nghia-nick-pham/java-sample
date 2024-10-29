package java_performance.thread_test_app_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Sample thread with two methods.
 * The one of that set the message.
 * The other read it.
 * Message will be used during investigation of a problem.
 * @author kvoykov
 */
public class ModifiedThread extends Thread implements JustifiedThread {
    private final ReadWriteLock propertiesLock = new ReentrantReadWriteLock();
    private final Lock read = propertiesLock.readLock();
    private final Lock write = propertiesLock.writeLock();
    private StringBuilder sb=new StringBuilder();

    /**
     * A method with long enough CPU intensive action.
     */
    @Override
    public void run() {
        long fact=1;
        System.out.println("Start of Run Method");
        for(int y=1; y<400000; y++){
            fact=1;
            for (long i = 2; i <= y; i++) {
                fact = fact * i;
            }
        }
        System.out.println("End of Run Method "+ fact);
    }

    /**
     * This method has to return enough information to investigate
     * an issue with many created instances of a class:
     */
    @Override
    public Object getJustificationMessage() {
        String ret=null;
        read.lock();
        try {
            ret=sb.toString();
        } finally {
            read.unlock();
        }
        return sb.toString();
    }

    /**
     * This method has to provide enough information to investigate
     * an issue with many created instances of a class:
     */
    @Override
    public void setJustificationMessage(String s) {
        write.lock();
        try {
            //delete contents - could be not needed in some cases
            sb.delete(0, sb.length());
            //set justification message
            sb.append(s);
        } finally {
            write.unlock();
        }
    }

}

