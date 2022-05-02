package flyweight;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapCreator  {
    private List<Building> buildings = new ArrayList<>();
    public void createBuilding(int x, int y, String name, String color, int memoryUsage,boolean isDestructible) {
        BuildingType type = BuildingMapGenerator.getBuildingType(name, color, memoryUsage);
        Building building = new Building(x, y, type,isDestructible);
        buildings.add(building);
    }

    public void buildingsInformation() {        //For test only, can't be found on project report.
        System.out.println("There are " + BuildingMapGenerator.buildingTypes.size()+" types of building exist (shared memory)");
        System.out.println("There are " + buildings.size() + " buildings in total.\n");
        int count = 0;
        for (int i = 0;i<buildings.size();i++)
            count  = count + 32 + 4;
        System.out.println(" Flyweight Pattern Memory Usage\t\tWithout Flyweight Pattern");
        System.out.println("---------------------------------\t------------------------");
        System.out.println("("+BuildingMapGenerator.usedMemory +" + "+ buildings.size()+") KB"+ "\t\t\t\t\t("  + count + "+" +buildings.size()+") KB" ) ;
        System.out.println("---------------------------------\t------------------------");
        System.out.println("= " + (BuildingMapGenerator.usedMemory + buildings.size())+" KB" + "\t\t\t\t\t\t\t= "  + (count +buildings.size()) +" KB" ) ;

    }

}