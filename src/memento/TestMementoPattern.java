package memento;

public class TestMementoPattern {
    public static void main(String[] args) {
        Caretaker careTaker = new Caretaker();
        GameOriginator originator = new GameOriginator("12:00", "Default Game memento.State", careTaker);

        System.out.println("Default memento.State: "+originator);

        originator.setState(new State("16:02", "memento.State 1"));

        System.out.println("---------------\n"+originator);
        originator.createSavepoint("SAVE 1");

        originator.setState(new State("16:10", "Buggy Game memento.State"));
        System.out.println("---------------\n"+originator);

        originator.undo();
        System.out.println("---------------\nAfter undo: "+originator);

        originator.setState(new State("17:02", "memento.State 3"));
        originator.createSavepoint("SAVE2");
        System.out.println("---------------\n"+originator);
        originator.setState(new State("17:11", "memento.State 4"));
        originator.createSavepoint("SAVE3");
        System.out.println("---------------\n"+originator);
        originator.setState(new State("18:32", "memento.State 5"));
        originator.createSavepoint("SAVE4");
        System.out.println("---------------\n"+originator);

        originator.undo("SAVE2");
        System.out.println("Retrieving at: "+originator);

        originator.undoAll();
        System.out.println("memento.State after undo all: "+originator);
    }
}