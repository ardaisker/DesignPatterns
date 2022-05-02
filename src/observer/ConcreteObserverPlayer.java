package observer;

public class ConcreteObserverPlayer implements ObserverPlayer{
    public String name;
    public ConcreteObject subject = new ConcreteObject("Destructible Object X", false);
    public boolean isSubjectDestroyed;

    public ConcreteObserverPlayer(String name){
        this.name = name;
        isSubjectDestroyed = false;
    }


    public void update(boolean isDestroyed) {
        if (isSubjectDestroyed != isDestroyed) {
            System.out.println(name + "'s Observer Updated");
            System.out.println(name + " is updating its game state.");
            System.out.println("--------------------------------------------");

        }
        isSubjectDestroyed = isDestroyed;
    }

}
