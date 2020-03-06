package kts.pattern.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Publisher {
    private List<Observer> observers = new ArrayList<>();
    private boolean flag;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Add Observer " + observer);
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        notifyObservers();
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++)
            observers.get(i).update(this.flag);
        System.out.println("Observer List : " + observers);
    }
}
