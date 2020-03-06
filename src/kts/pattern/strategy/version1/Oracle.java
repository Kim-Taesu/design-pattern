package kts.pattern.strategy.version1;

public class Oracle extends Database {

    public Oracle() {
        name = "Oracle";
        rows = 10;
    }

    @Override
    public void connect() {
        System.out.println(name + " 에 접속..");
    }
}
