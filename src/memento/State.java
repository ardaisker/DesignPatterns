package memento;

public class State {
    String  stateDate;
    String stateName;
    public State( String stateDate,String stateName){
        this.stateDate = stateDate;
        this.stateName = stateName;
    }
    void setStateDate(String stateDate){
        this.stateDate = stateDate;
    }
    String getStateDate(){
        return stateDate;
    }

}
