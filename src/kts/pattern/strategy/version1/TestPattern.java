package kts.pattern.strategy.version1;

public class TestPattern {
    public static void main(String[] args) {
        DatabaseUse myDB = new DatabaseUse();

        myDB.setDatabase(new MySQL());
        myDB.connect();
        myDB.select();

        myDB.setDatabase(new Postgresql());
        myDB.connect();
        myDB.select();

        myDB.setDatabase(new Oracle());
        myDB.connect();
        myDB.select();
    }
}
