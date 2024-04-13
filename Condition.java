public class Condition {
    public int sunlightReq;
    public int waterReq;
    public int growthRate;

    public Conditions(){}

    public Conditions(int sunlight, int water, int gr){
        sunlightReq = sunlight;
        waterReq = water;
        growthRate = gr;
    }

    public getSunlightReq(){return sunlightReq;}

    public getWaterReq(){return waterReq;}

    public getGrowthReq(){return growthRate;}
}
