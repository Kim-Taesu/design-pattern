package kts.pattern.observer.basic;

public class TestPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);


        subject.setFlag(true);
        subject.setFlag(false);
        subject.setFlag(true);
    }
}
