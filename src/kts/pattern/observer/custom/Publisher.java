package kts.pattern.observer.custom;


public interface Publisher {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}
