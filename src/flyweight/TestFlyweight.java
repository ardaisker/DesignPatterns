package flyweight;
import java.util.Random;

public class TestFlyweight {
    public static void main(String[] args) {
        Random rand = new Random();
        MapCreator creator = new MapCreator();
        for (int i = 0; i < 500000; i++) {
            creator.createBuilding(rand.nextInt(1000),rand.nextInt(1000), "Destructible Building",
                    "Red",32,true);
            creator.createBuilding(rand.nextInt(1000),rand.nextInt(1000), "Non-destructible Building",
                    "Blue",4,false);
        }
        creator.buildingsInformation();
    }
}
