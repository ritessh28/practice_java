package Oops.Inherit;

public class BoxPrice extends WeightBox {
    double cost;

    public BoxPrice() {
        this.cost = -1;
    }

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
    public BoxPrice(BoxPrice other)
    {
        this.cost=other.cost;
    }
    public BoxPrice(double cost,double weight,double side)
    {
            this.cost=cost;
            super(weight,side);
    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }
}
