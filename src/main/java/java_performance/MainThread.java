package java_performance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainThread {


    public static void main(String[] args) {
        RequestParamThreadDto requestParamThread = new RequestParamThreadDto();
        requestParamThread.setThreadPoolType(2);
        requestParamThread.setNumberOfThread(1000000);
        requestParamThread.setNumberOfRequest(2);
        requestParamThread.setFixedNumOfTPool(1000000);
        testPerformanceWIThread( requestParamThread);
    }

    public static void testPerformanceWIThread(RequestParamThreadDto requestParamThread ){

        ExecutorService executor;
        if(requestParamThread.getThreadPoolType() == 1){ //Single thread
            executor = Executors.newSingleThreadExecutor();
        }
        else if (requestParamThread.getThreadPoolType() == 2){ // Fixed number of thread
            executor = (ThreadPoolExecutor)  Executors.newFixedThreadPool(requestParamThread.getFixedNumOfTPool());
        }
        else if (requestParamThread.getThreadPoolType() == 3){ // Maximum number of thread
            executor = (ThreadPoolExecutor)  Executors.newCachedThreadPool();
        }
        else {
            executor = (ThreadPoolExecutor)  Executors.newFixedThreadPool(10);
        }

        List<String> lstPerRes = new ArrayList<>();

        for (int i = 0; i < requestParamThread.getNumberOfThread(); i++) {
            @SuppressWarnings("unused")
            int count = i + 1;
            Task task = new Task(requestParamThread);

            long startTime = System.currentTimeMillis();
            executor.execute(task);
            long endTime = System.currentTimeMillis();
            long elapseTime = endTime - startTime;

            System.out.println(String.format("%20d | %20d | %20d", startTime, endTime, elapseTime));

        }

        executor.shutdown();
    }


    static class Task implements Runnable {


        private RequestParamThreadDto requestParamThread;


        public Task(RequestParamThreadDto requestParamThread) {
            this.requestParamThread = requestParamThread;
        }

        @Override
        public void run() {
            HttpClientExample httpClientExample = new HttpClientExample();
            try {

                for(int i = 0; i < requestParamThread.getNumberOfRequest(); i++){
                    try {
                        httpClientExample.sendGet();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    long stopTime = System.currentTimeMillis();

                    TimeUnit.SECONDS.sleep(requestParamThread.getSleepTime());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    httpClientExample.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
    }
}
