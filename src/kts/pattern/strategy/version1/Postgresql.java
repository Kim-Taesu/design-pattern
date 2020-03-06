package kts.pattern.strategy.version1;

public class Postgresql extends Database {

    public Postgresql() {
        name = "Postgresql";
        rows = 40;
    }

    @Override
    public void connect() {
        System.out.println(name + " 에 접속..");
    }
}
