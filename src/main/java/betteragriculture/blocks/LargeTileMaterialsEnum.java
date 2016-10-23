package betteragriculture.blocks;

import net.minecraft.util.IStringSerializable;

public enum LargeTileMaterialsEnum implements IStringSerializable {
	
	
    CLAY(0, "clay"),
    CONCRETE(1, "concrete"),
	QUARTZ(2, "quartz"),
	SLATE(3, "slate");


    private int ID;
    private String name;
    
    private LargeTileMaterialsEnum(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}