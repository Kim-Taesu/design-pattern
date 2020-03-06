package kts.pattern.singleton.logging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogWriter {
    private static LogWriter logWriter = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter("./log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance() {
        return logWriter;
    }

    // 하나의 파일에 로그를 작성하기 때문에 여러 개의 쓰레드에서 call 하더라도 로그가 추가되도록 synchronized 사용
    public synchronized void logging(String str) {
        try {
            bw.write(LocalDateTime.now() + " : " + str + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
            bw.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
