package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObject implements DestructibleObject {
    List<ConcreteObserverPlayer> observers = new ArrayList<>();
    private String name;
    private boolean subjectState;
    public ConcreteObject(String name, boolean isDestroyed){
        this.name = name;
        this.subjectState = isDestroyed;
    }


    public void attach(ConcreteObserverPlayer observer){
        observers.add(observer);
        observer.update(subjectState);
    }
    public void detach(ConcreteObserverPlayer observer){

        observers.remove(observer);
    }


    public void notifyObservers(){
        for(ConcreteObserverPlayer observer : observers){
            observer.update(subjectState);
        }
    }
    void setState(boolean isDestroyed){
        this.subjectState = isDestroyed;
        notifyObservers();
    }
    public boolean getState(){
        return subjectState;
    }



}
