package prototype;

public class AllyNPC extends NPC{
    public int level;

    public AllyNPC (){ }
    public AllyNPC(AllyNPC protoypeNPC) {
        super(protoypeNPC);
        if(protoypeNPC != null)
            this.level = protoypeNPC.level;
    }

    public NPC cloneNPC(){
        return new AllyNPC(this);
    }
}
