package memento;

public class GameOriginator {
    private State state;
    private String lastUndoSavepoint;
    Caretaker careTaker;

    public GameOriginator(String stateDate,String stateName,Caretaker careTaker){
        state = new State(stateDate,stateName);
        this.careTaker = careTaker;
        createSavepoint("INITIAL");
    }

    public State getState(){
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void createSavepoint(String savepointName){
        careTaker.createMemento(new Memento(state.stateDate,state.stateName), savepointName);
        lastUndoSavepoint = savepointName;
    }

    public void undo(){
        setOriginatorState(lastUndoSavepoint);
    }

    public void undo(String savepointName){
        setOriginatorState(savepointName);
    }

    public void undoAll(){
        setOriginatorState("INITIAL");
        careTaker.clearSavepoints();
    }

    private void setOriginatorState(String savepointName){
        Memento mem = careTaker.getMemento(savepointName);
        State dummy = mem.getState();
        this.state.stateDate = dummy.stateDate;
        this.state.stateName = dummy.stateName;
    }

    @Override
    public String toString(){
        return "Game's memento.State Date: "+state.stateDate+", memento.State Name: "+state.stateName;
    }

}

 class Memento {

    private State s;

    public Memento(String stateDate,String stateName){
        s = new State(stateDate,stateName);
    }

    public State getState(){
        return s;
    }
}
