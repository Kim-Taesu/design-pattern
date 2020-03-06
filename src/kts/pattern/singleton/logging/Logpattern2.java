package kts.pattern.singleton.logging;

public class Logpattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Thread thread = new ThreadLogging(i);
            thread.start();
        }
    }
}

class ThreadLogging extends Thread {
    int num;

    public ThreadLogging(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        LogWriter logger = LogWriter.getInstance();
        if (num < 10) {
            logger.logging("*** 0" + num + " ***");
        } else {
            logger.logging("*** " + num + " ***");
        }
    }
}