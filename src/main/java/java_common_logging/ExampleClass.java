package java_common_logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExampleClass {
    private static Log log = LogFactory.getLog(ExampleClass.class);
    public static void main(String[] args) {
        log.info("info in the main method");
        log.debug("debug");
        log.error("error in the main method");

    }

}
