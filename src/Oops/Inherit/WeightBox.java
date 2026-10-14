package Oops.Inherit;

public class WeightBox extends Box {
    double weight;

    public WeightBox(double l,double w,double h,double weight) {
        super(l,w,h);
        this.weight = weight;
    }
    public WeightBox()
    {

        this.weight=-4;
        System.out.println(super.weight);
    }
    public WeightBox(double weight,double side)
    {
        this.weight=weight;
        super(side);

    }
    public WeightBox(WeightBox other)
    {
        super(other);
        this.weight=other.weight;
    }
}
