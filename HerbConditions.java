import java.util.*;
import java.io.*;

public class HerbConditions{
    public String name;
    public Condition poorCondition;
    public Condition aveCondition;
    public Condition bestCondition;
    public List<HerbCondition> herbRequirements;

    public HerbCondition(String name, Condition poorCondition, Condition aveCondition, Condition bestCondition){
        this.name = name;
        this.poorConditions = poorCondition;
        this.aveCondition = aveCondition;
        this.bestCondition = bestCondition;
    }

    public void loadConditions(){
        HerbCondition basil = new HerbCondition("Basil", new Condition(40, 60, 2), new Condition(60, 70, 5), new Condition(90, 80, 8));
        HerbCondition rosemary = new HerbCondition("Rosemary", new Condition(60, 50, 4), new Condition(70, 60, 7), new Condition(100, 80, 10));
        HerbCondition mint = new HerbCondition("Mint", new Condition(30, 80, 1), new Condition(50, 70, 4), new Condition(80, 90, 7));
        HerbCondition lavender = new HerbCondition("Lavender", new Condition(40, 40, 3), new Condition(60, 50, 6), new Condition(80, 60, 9));
        HerbCondition cilantro = new HerbCondition("Cilantro", new Condition(70, 30, 5), new Condition(80, 50, 8), new Condition(100, 70, 11));
        HerbCondition angelica = new HerbCondition("Angelica", new Condition(10, 85, 1), new Condition(30, 75, 3), new Condition(60, 90, 6));
        HerbCondition ginseng = new HerbCondition("Ginseng", new Condition(20,70,1), new Condition(40, 80, 4), new Condition(70, 100, 7));
        HerbCondition patchouli = new HerbCondition("Patchouli", new Condition(40, 70, 3), new Condition(60, 80, 6), new Condition(90, 100, 9));
        HerbCondition valerian = new HerbCondition("Valerian", new Condition(15, 70, 3), new Condition(40, 50, 5), new Condition(80, 90, 8));
        HerbCondition rue = new HerbCondition("Rue", new Condition(70, 30, 6), new Condition(80, 40, 9), new Condition(100, 60, 12));

        herbRequirements.add(basil);
        herbRequirements.add(rosemary);
        herbRequirements.add(mint);
        herbRequirements.add(lavender);
        herbRequirements.add(cilantro);
        herbRequirements.add(angelica);
        herbRequirements.add(patchouli);
        herbRequirements.add(ginseng);
        herbRequirements.add(valerian);
        herbRequirements.add(rue);
    }

    


}