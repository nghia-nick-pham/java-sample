package java_performance;

public class RequestParamThreadDto {
    private  boolean isThread;
    //0: Single thread; 1: Fixed number of thread; 2: Maximum number of thread;
    private  int threadPoolType;
    private  int fixedNumOfTPool;
    private  int numberOfRequest;
    private  int numberOfThread;
    private  long sleepTime;

    public boolean isThread() {
        return isThread;
    }

    public void setThread(boolean thread) {
        isThread = thread;
    }

    public int getThreadPoolType() {
        return threadPoolType;
    }

    public void setThreadPoolType(int threadPoolType) {
        this.threadPoolType = threadPoolType;
    }

    public int getFixedNumOfTPool() {
        return fixedNumOfTPool;
    }

    public void setFixedNumOfTPool(int fixedNumOfTPool) {
        this.fixedNumOfTPool = fixedNumOfTPool;
    }

    public int getNumberOfRequest() {
        return numberOfRequest;
    }

    public void setNumberOfRequest(int numberOfRequest) {
        this.numberOfRequest = numberOfRequest;
    }

    public int getNumberOfThread() {
        return numberOfThread;
    }

    public void setNumberOfThread(int numberOfThread) {
        this.numberOfThread = numberOfThread;
    }

    public long getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
    }
}
