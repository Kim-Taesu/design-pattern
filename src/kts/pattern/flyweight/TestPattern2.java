package kts.pattern.flyweight;

public class TestPattern2 {
    public static void main(String[] args) {
        // 새롭게 객체 pool에 추가
        MyData myData1 = new MyData();
        myData1.x = 10;
        myData1.y = 11;
        myData1.name = "kts";

        // 객체 pool에 있는 myData1을 공유
        MyData myData2 = new MyData();
        myData2 = myData1;

        // 새롭게 객체 pool에 추가
        MyData myData3 = new MyData();
        myData3.x = 20;
        myData3.y = 21;
        myData3.name = "laesu";

        // myData1과 myData2 는 서로 공유하기 때문에 두개 다 변경경
        myData2.name = "update_kts";
    }
}

class MyData {
    int x;
    int y;
    String name;
}
