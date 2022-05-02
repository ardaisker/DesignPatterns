package prototype;

public class EnemyNPC extends NPC{
    public int level;

    public EnemyNPC (){ }
    public EnemyNPC(EnemyNPC protoypeNPC) {
        super(protoypeNPC);
        if(protoypeNPC != null)
            this.level = protoypeNPC.level;
    }
    public NPC cloneNPC(){
        return new EnemyNPC(this);
    }
}
