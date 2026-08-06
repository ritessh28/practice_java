package LooseCoupling;

public class Water {
    WaterType w;
    public void setWaterType(WaterType w) {
        this.w = w;
    }
    public void drinkingWater()
    {
        System.out.println("Drinking :");
        w.display();
    }
}
