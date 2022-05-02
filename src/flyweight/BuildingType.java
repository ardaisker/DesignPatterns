package flyweight;

public class BuildingType {
    private String name;
    private String color;
    private int memoryUsage;

    public BuildingType(String name, String color, int memoryUsage) {
        this.name = name;
        this.color = color;
        this.memoryUsage = memoryUsage;
    }
}
