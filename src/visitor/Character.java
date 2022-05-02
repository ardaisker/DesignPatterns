package visitor;

public class Character implements Unit{
    public String controller;
    public String weapon;
    public String clothing;
    public String skeleton;

    public Character(String controller,String weapon, String clothing, String skeleton){
        this.controller = controller;
        this.weapon = weapon;
        this.clothing = clothing;
        this.skeleton = skeleton;
    }

    @Override
    public void accept(TerminationVisitor v) {
        v.visitCharacter(this);
    }
}
