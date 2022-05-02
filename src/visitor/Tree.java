package visitor;

public class Tree implements Unit{
    String x;
    String y;
    public Tree (String x, String y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(TerminationVisitor v) {
        v.visitTree(this);
    }
}
