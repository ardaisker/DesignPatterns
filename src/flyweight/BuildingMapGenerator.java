package flyweight;
import java.util.HashMap;
import java.util.Map;

public class BuildingMapGenerator {
    public static Map<String, BuildingType> buildingTypes = new HashMap<>();
    public static int usedMemory = 0;

    public static BuildingType getBuildingType(String name, String color, int  memoryUsage) {
        BuildingType result = buildingTypes.get(name);
        if (result == null) {
            result = new BuildingType(name, color, memoryUsage);
            buildingTypes.put(name, result);
            usedMemory += memoryUsage;
        }
        return result;
    }
}