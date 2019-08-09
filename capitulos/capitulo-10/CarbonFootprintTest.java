import java.util.ArrayList;
import java.util.List;

public class CarbonFootprintTest{

    public static void main(String[] args) {
        Car car = new Car(150);
        Building building = new Building(100);
        Bicycle bicycle = new Bicycle(800);

        List<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(car);
        carbonFootprints.add(building);
        carbonFootprints.add(bicycle);

        for (CarbonFootprint current : carbonFootprints) {
            System.out.println( "Cálculo do carbono " + current.getCarbonFootprint() );
        }
    }
}