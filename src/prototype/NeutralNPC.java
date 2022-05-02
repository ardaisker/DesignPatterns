package prototype;

public class NeutralNPC extends NPC{
    public int level;

    public NeutralNPC (){ }
    public NeutralNPC(NeutralNPC protoypeNPC) {
        super(protoypeNPC);
        if(protoypeNPC != null)
            this.level = protoypeNPC.level;
    }
    public NPC cloneNPC(){
        return new NeutralNPC(this);
    }
}
