package kts.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;


public class TestPattern3 {
    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("b");
    }
}

class FlyweightFactory {
    private static Map<String, Subject> map = new HashMap<>();

    // 공통되는 자원이 있으면 생성하지 않고 return
    public Subject getSubject(String key) {
        Subject subject = map.get(key);
        if (subject == null) {
            subject = new Subject(key);
            map.put(key, subject);
            System.out.println("new");
        } else {
            System.out.println("exist");
        }
        return subject;
    }
}

class Subject {
    private String name;

    public Subject(String name) {
        this.name = name;
    }
}