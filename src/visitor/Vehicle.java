package visitor;

public class Vehicle implements Unit{
    public String controller;
    public String physics;

    public Vehicle(String controller, String physics){
        this.controller = controller;
        this.physics = physics;
    }

    @Override
    public void accept(TerminationVisitor v) {
        v.visitVehicle(this);
    }
}
