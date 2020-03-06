package kts.pattern.strategy.version1;

public class MySQL extends Database {

    public MySQL() {
        name = "MySQL";
        rows = 20;
    }

    @Override
    public void connect() {
        System.out.println(name + " 에 접속..");
    }
}
