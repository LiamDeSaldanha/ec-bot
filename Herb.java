import java.lang.reflect.Array;
import java.util.ArrayList;

public class Herb {
    private String name;
    private Int sellingPrice;
    private ArrayList<duble> currentConditions = new ArrayList<>();
    private ArrayList<duble> poorConditions = new ArrayList<>();
    private ArrayList<duble> fairConditions = new ArrayList<>();
    private ArrayList<duble> excellentConditions = new ArrayList<>();
    private Int diameter;
    private Int verticalGrowth;
    private double shadowExperienced;
    private Node position;

    Herb(String name, Int sellingPrice, ArrayList<duble> currentConditions, ArrayList<duble> poorConditions,
            ArrayList<duble> fairConditions,
            ArrayList<duble> excellentConditions, Int diameter, Int verticalGrowth, double shadowExperienced) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.currentConditions = currentConditions;
        this.poorConditions = poorConditions;
        this.fairConditions = currentConditions;
        this.excellentConditions = currentConditions;
        this.diameter = diameter;
        this.verticalGrowth = verticalGrowth;
        this.shadowExperienced = shadowExperienced;

    }

    public void setWater(double Water) {
        this.currentWater = Water;
    }

    public void setSunlight(double sunlight) {
        this.currentSunlight = sunlight;
    }

    public double getWater() {
        return currentWater;
    }

    public double getSunlight() {
        return currentSunlight;
    }

    public double getShadowExperienced() {
        return shadowExperienced;
    }

    public double getDiamter() {
        return diameter;
    }
    public Node getNode(){
        return position;
    }

}
