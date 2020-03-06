package kts.pattern.observer.basic;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer {
    // 등록될 Subject
    Observable observable;
    // 실행 여부
    private boolean flag;

    public Observer2(Observable observable) {
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
            System.out.println("Observer2 flag is " + true);
        } else {
            System.out.println("Observer2 flag is " + false);
            System.out.println("\tDelete Observer2");
            observable.deleteObserver(this);
        }
    }
}
