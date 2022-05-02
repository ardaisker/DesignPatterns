package visitor;
public class GameUnit {
    Tree t;
    Vehicle v;
    Character c;
    Camera cam;

    public GameUnit(Tree t, Vehicle v, Character c, Camera cam){
        this.t = t;
        this.v = v;
        this.c = c;
        this.cam =cam;
    }
    public void gameOver(TerminationVisitor visitor){
        t.accept(visitor);
        v.accept(visitor);
        c.accept(visitor);
        cam.accept(visitor);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("500","200");
        System.out.println("Tree object is created.");
        Vehicle vehicle = new Vehicle("Vehicle Controller","VehiclePhysics");
        System.out.println("Vehicle object is created.");
        Character character = new Character("PlayerInputController","Rifle","Camo","Soldier Skeleton");
        System.out.println("Character object is created.");
        Camera camera = new Camera("3D Camera", "South");
        System.out.println("Camera object is created.");
        GameUnit gameUnit = new GameUnit(tree,vehicle,character,camera);
        System.out.println("The game has begun...");
        System.out.println("The game is over, TerminationVisitor is calling to terminate objects.");
        TerminationVisitor visitor = new TerminationVisitor(false);
        gameUnit.gameOver(visitor);
        System.out.println("All Game Unit objects terminated successfully, deleted on memory by garbage collector.");
        System.out.println("Tree Object Variables : " + tree.x);
        System.out.println("Vehicle Object Variables : " + vehicle.controller);
        System.out.println("Character Object Variables : " + character.skeleton);
        System.out.println("Camera Object Variables : " + camera.direction);
        System.out.println("Is all objects on Game Unit Terminated ? : " + visitor.isAllTerminated);

    }
}
