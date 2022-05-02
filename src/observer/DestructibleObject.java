package observer;

public interface DestructibleObject {
    void attach(ConcreteObserverPlayer observer);
    void detach(ConcreteObserverPlayer observer);
    void notifyObservers();
}
