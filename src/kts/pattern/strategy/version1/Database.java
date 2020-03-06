package kts.pattern.strategy.version1;

public abstract class Database {
    public String name;
    public double rows;

    // 접속 라이브러리는 서로 다르다.
    public abstract void connect();

    // 표준 SQL 사용
    public void insertData() {
        System.out.println(this.name + " 에 데이터 추가");
    }

    public void selectData() {
        System.out.println(this.name + " 에서 데이터를 " + this.rows + "개 조회");
    }
}
