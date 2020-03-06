package kts.pattern.singleton.database;

public class TestPattern1 {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        Database database2 = Database.getInstance();

        System.out.println(database.equals(database2));
    }
}
