package kts.pattern.observer.basic;

import java.util.Observable;

// 감시의 대상 (Subject 객체)
public class Subject extends Observable {
    // 실행 여부
    private boolean flag;

    public Subject() {
    }
    // 실행 여부 값 반환


    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        // 값을 변경하고
        this.flag = flag;
        // 변경 사항을 저장하고
        setChanged();
        // 변경 사항을 알린다.
        notifyObservers();
    }
}
