package observer;

public class Test {
    public static void main(String[] args) {
        ConcreteObject BuildingSubject = new ConcreteObject("Building",false);    //Destructible Subject "Building" created.

        ConcreteObserverPlayer player1 = new ConcreteObserverPlayer("Player 1");
        ConcreteObserverPlayer player2 = new ConcreteObserverPlayer("Player 2");
        ConcreteObserverPlayer player3 = new ConcreteObserverPlayer("Player 3");      //Observer Players are created.
        ConcreteObserverPlayer player4 = new ConcreteObserverPlayer("Player 4");
        ConcreteObserverPlayer player5 = new ConcreteObserverPlayer("Player 5");

        BuildingSubject.attach(player1);
        BuildingSubject.attach(player2);
        BuildingSubject.attach(player3);        ///All observers attach (being subscribers) to the current Subject
        BuildingSubject.attach(player4);
        BuildingSubject.attach(player5);

        BuildingSubject.setState(true);      //Building is now destroyed.
        BuildingSubject.setState(true);      //Building is set to destroyed again, players shouldn't react to this action.

        BuildingSubject.detach(player1);        //Player 1 and Player 2 are no more subscribers.
        BuildingSubject.detach(player3);

        System.out.println("\n-------------Destruction is now set to false.-------------\n");

        BuildingSubject.setState(false);
        System.out.println("\n\n----Each player's view of the destructible building----");
        System.out.println("Is the building has been destruct on Player 1's view: " + player1.isSubjectDestroyed);
        System.out.println("Is the building has been destruct on Player 2's view: " + player2.isSubjectDestroyed);
        System.out.println("Is the building has been destruct on Player 3's view: " + player3.isSubjectDestroyed);
        System.out.println("Is the building has been destruct on Player 4's view: " + player4.isSubjectDestroyed);
        System.out.println("Is the building has been destruct on Player 5's view: " + player5.isSubjectDestroyed);

    }
}
