package visitor;

public interface Visitor {
    public void visitTree(Tree t);
    public void visitVehicle(Vehicle v);
    public void visitCharacter(Character c);
    public void visitCamera(Camera c);
}
