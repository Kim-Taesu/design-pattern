package kts.pattern.singleton.logging;

public class LogPattern1 {

    public static void main(String[] args) {
        LogWriter logger;
        logger = LogWriter.getInstance();
        logger.logging("kts");
        logger = LogWriter.getInstance();
        logger.logging("laesu");
    }
}
