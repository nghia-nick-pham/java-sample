package java_performance.thread_counting;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
//        System.out.println("Number of threads " + Thread.activeCount());
//        System.out.println("Current Thread Group - " + Thread.currentThread().getThreadGroup().getName());
//        System.out.println("Total Number of threads " + ManagementFactory.getThreadMXBean().getThreadCount());
//            printUsage();
//        System.out.println(System.currentTimeMillis());
//        System.out.println(Runtime.getRuntime().availableProcessors());

        StringBuilder str = new StringBuilder();

        double d = 0.34568;
        DecimalFormat f = new DecimalFormat("#0.00");
        str.append("abc ");
        str.append(f.format(d * 100));
        str.append(" end");
        System.out.println(str.toString());
    }

    private static void printUsage() {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        long start = System.currentTimeMillis();
        for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
            method.setAccessible(true);
//            System.out.println(method.getName());

            if (method.getName().startsWith("get")
                    && Modifier.isPublic(method.getModifiers())) {
                Object value;
//                Double value;
                try {

                    value =  method.invoke(operatingSystemMXBean);
                } catch (Exception e) {
                    value = e;
                } // try

                if (value instanceof Double){
                    System.out.println(method.getName() + " = " + (((Double)value * 1000)/ 10.0));
                }
                else if (value instanceof Long && method.getName().indexOf("Time") > 0 ){
                    Timestamp ts = new Timestamp((long)value);

                    System.out.printf("Total cpu time: %s ms; real time: %s", (long)value / 1E6, (System.currentTimeMillis() - start));
//                    System.out.println(method.getName() + " = " + new Date(ts.getTime()));
                }
                else if (value instanceof Long && method.getName().indexOf("Size") > 0 ){
                    System.out.println(method.getName() + " = " + (long)value / (1024 * 1024));

                }
                else if (value instanceof Long ){
                    System.out.println(method.getName() + " = " + value);
                }

                else {
                    System.out.println(method.getName() + " = " + value);
                }

            } // if
        } // for
    }
}
