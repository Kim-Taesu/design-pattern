package kts.pattern.singleton.database;

public class Database {
    // 프로그램 시작시 제일 먼저 초기화 된다.
    private static Database database = new Database("database");
    private String name;

    // synchronized는 비용이 비싼 함수
//    public synchronized static Database getInstance(String name) {
//        if (database == null) {
//            database = new Database(name);
//        }
//        return database;
//    }

    private Database(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance() {
        return database;
    }

    public String getName() {
        return name;
    }
}
