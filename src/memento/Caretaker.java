package memento;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

    private final Map<String, Memento> history = new HashMap<String, Memento>();
    public void createMemento(Memento memento,String savepointName){
        System.out.println("Saving state..."+savepointName);
        history.put(savepointName, memento);
    }

    public Memento getMemento(String savepointName){
        System.out.println("Undo at ..."+savepointName);
        return history.get(savepointName);
    }

    public void clearSavepoints(){
        System.out.println("Clearing all save points...");
        history.clear();
    }
}
