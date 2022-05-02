package prototype;

import java.util.Objects;

public abstract class NPC {
    public String weapon;
    public String clothing;
    public String skeleton;
    public String controller;

    public NPC (){ }
    public NPC (NPC source){
        if (source != null){
            this.weapon = source.weapon;
            this.clothing = source.clothing;
            this.skeleton = source.skeleton;
            this.controller = source.controller;
        }
    }
    public abstract NPC cloneNPC();
}
