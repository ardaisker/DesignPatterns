package prototype;
import java.util.ArrayList;

public class NPCCreator {
    private AllyNPC allyPrototype;
    private EnemyNPC enemyPrototype;
    private NeutralNPC neutralPrototype;
    private ArrayList <NPC> soldiers = new ArrayList<>();
    public NPCCreator(){
        allyPrototype = new AllyNPC();
        allyPrototype.weapon = "Combat Uniform";
        allyPrototype.clothing = "Regular";
        allyPrototype.skeleton = "RigidBody";
        allyPrototype.controller = "AIController";
        allyPrototype.level = 20;

        enemyPrototype = new EnemyNPC();
        enemyPrototype.weapon = "Pistol";
        enemyPrototype.clothing = "Camo Uniform";
        enemyPrototype.skeleton = "RigidBody";
        enemyPrototype.controller = "AIController";
        enemyPrototype.level = 30;

        neutralPrototype = new NeutralNPC();
        neutralPrototype.weapon = "Knife";
        neutralPrototype.clothing = "Service Uniform";
        neutralPrototype.skeleton = "RigidBody";
        neutralPrototype.controller = "AIController";
        neutralPrototype.level = 40;

    }
    public void createAllyArmy(int size){
        for (int i = 0; i<size;i++){
            soldiers.add(allyPrototype.cloneNPC());
        }
        System.out.println(size + " Ally NPC Created.");
    }
    public void createEnemyArmy(int size){
        for (int i = 0; i<size;i++){
            soldiers.add(enemyPrototype.cloneNPC());
        }
        System.out.println(size + " Enemy NPC Created.");
    }

    public void createNeutralArmy(int size){
        for (int i = 0; i<size;i++){
            soldiers.add(neutralPrototype.cloneNPC());
        }
        System.out.println(size + " Neutral NPC Created.");
    }

    public static void main(String[] args) {
        NPCCreator creator = new NPCCreator();
        creator.createAllyArmy(100);
        creator.createAllyArmy(100);
        creator.createAllyArmy(300);
        creator.createAllyArmy(300);
        creator.createAllyArmy(300);
        creator.createAllyArmy(300);
        creator.createAllyArmy(300);
        creator.createAllyArmy(300);

        creator.createEnemyArmy(300);
        creator.createEnemyArmy(300);
        creator.createEnemyArmy(300);
        creator.createEnemyArmy(300);
        creator.createEnemyArmy(300);

        creator.createNeutralArmy(200);
        creator.createNeutralArmy(200);
        creator.createNeutralArmy(200);
        creator.createNeutralArmy(200);
        creator.createNeutralArmy(200);

        System.out.println("There are " + creator.soldiers.size() + " NPCs exist on the game");
        int allyNumber = 0;
        int enemyNumber = 0;
        int neutralNumber = 0;
        for (NPC npc: creator.soldiers) {
            if (npc instanceof AllyNPC)
                allyNumber++;
            if (npc instanceof EnemyNPC)
                enemyNumber++;
            if (npc instanceof NeutralNPC)
                neutralNumber++;
        }
        System.out.println("There are " + allyNumber + " Ally NPCs exist on the game");
        System.out.println("There are " + enemyNumber + " Enemy NPCs exist on the game");
        System.out.println("There are " + neutralNumber + " Neutral NPCs exist on the game");

    }

}
