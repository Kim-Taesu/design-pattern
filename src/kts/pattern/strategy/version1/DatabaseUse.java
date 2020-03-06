package kts.pattern.strategy.version1;

public class DatabaseUse {
    private Database database;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void connect() {
        if (database == null) {
            System.out.println("데이터베이스를 먼저 선택하세요.");
        } else {
            database.connect();
        }
    }

    public void select() {
        database.selectData();
    }
}
