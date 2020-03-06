package kts.pattern.singleton.database;

public class TestPattern2 {

    // Thead 인스턴스가 공유하기 위해 static 선언
    static int nNum = 0;

    public static void main(String[] args) {

        // Thead 에서 database 생성 시 database가 null로 인식되어 계속 객체를 생성
        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance();
                System.out.println(database.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
