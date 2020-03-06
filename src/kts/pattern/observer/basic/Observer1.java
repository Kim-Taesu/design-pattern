package kts.pattern.observer.basic;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer {
    // 등록될 Subject
    Observable observable;
    // 실행 여부
    private boolean flag;

    public Observer1(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject) {
            Subject subject = (Subject) o;
            this.flag = subject.getFlag();
            actionControl();
        }
    }

    private void actionControl() {
        if (this.flag) {
            System.out.println("Observer1 flag is " + true);
        } else {
            System.out.println("Observer1 flag is " + false);
        }
    }
}
