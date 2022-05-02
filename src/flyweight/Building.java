package flyweight;
public class Building {
    private int x;
    private int y;
    private boolean isDestructible;
    private BuildingType type;
    public Building(int x, int y, BuildingType type,boolean isDestructible) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.isDestructible = isDestructible;
    }
}