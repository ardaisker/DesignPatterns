package visitor;

public class TerminationVisitor implements Visitor {
    boolean isAllTerminated;
    public TerminationVisitor(boolean isAllTerminated){
        this.isAllTerminated = isAllTerminated;
    }
    public void visitTree(Tree t){
        t.x = null;
        t.y = null;
        t = null;
        System.gc();
    }
    public void visitVehicle(Vehicle v){
        v.controller = null;
        v.physics = null;
        v = null;
        System.gc();
    }
    public void visitCharacter(Character c){
        c.controller = null;
        c.weapon = null;
        c.clothing = null;
        c.skeleton = null;
        c = null;
        System.gc();
    }
    public void visitCamera(Camera c){
        c.setCameraType(null);
        c.direction = null;
        c = null;
        System.gc();
        isAllTerminated = true;
    }

}
