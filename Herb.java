public class Herb {
    private String name;
    private Int sellingPrice;
    private double currentWater;
    private double currentSunlight;
    private double requiredWater;
    private double requiredSunlight;
    private Int diameter;
    private Int verticalGrowth;
    private double shadowExperienced;


    Herb(String name, Int sellingPrice, double currentWater, double currentSunlight, double requiredWater,
            double requiredSunlight, Int diameter, Int verticalGrowth, double shadowExperienced) {
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.currentWater = currentWater;
        this.currentSunlight = currentSunlight;
        this.requiredWater = requiredWater;
        this.requiredSunlight = requiredSunlight;
        this.diameter = diameter;
        this.verticalGrowth = verticalGrowth;
        this.shadowExperienced = shadowExperienced;

    }

    public setHerbRequireMents(){

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

}
