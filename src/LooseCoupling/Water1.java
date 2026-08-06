package LooseCoupling;

public class Water1 {
    SparklingWater m;
    public Water1(SparklingWater m)
    {
        this.m = m;
    }
    public void show()
    {
        System.out.println("Drinking:");
        m.display();
    }
}

