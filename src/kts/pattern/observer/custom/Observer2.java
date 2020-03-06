package kts.pattern.observer.custom;

public class Observer2 implements Observer {
    // 등록될 Subject
    Subject subject;
    // 실행 여부
    private boolean flag;

    public Observer2(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(boolean flag) {
        this.flag = flag;
        actionControl();
    }

    private void actionControl() {
        if (this.flag) {
            System.out.println("Observer2 flag is " + true);
        } else {
            System.out.println("Observer2 flag is " + false);
            System.out.println("\tDelete Observer2");
            subject.deleteObserver(this);
        }
    }
}
