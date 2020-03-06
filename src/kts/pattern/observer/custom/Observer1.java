package kts.pattern.observer.custom;

public class Observer1 implements Observer {
    // 등록될 Subject
    Subject subject;
    // 실행 여부
    private boolean flag;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }


    @Override
    public void update(boolean flag) {
        this.flag = flag;
        actionControl();
    }

    private void actionControl() {
        if (this.flag) {
            System.out.println("Observer1 flag is " + true);
        } else {
            System.out.println("Observer1 flag is " + false);
        }
    }
}
