

public class Building implements CarbonFootprint{

    private final int area;

    public Building(){
        this.area = 0;
    }

    public Building(int area){
        this.area = area;
    }

    @Override
    public int getCarbonFootprint() {
        return getArea();
    }

    public int getArea() {
        return area;
    }

    public String toString(){
        return String.format("Area: %d", getArea());
    }



}