package Oops.Inherit;

public class Box {
    double len;
    double wid, height,weight=47.9;

    public Box() {
        this.len = -1;
        this.wid = -1;
        this.height = -1;
    }

    public Box(double height, double len, double wid) {
        this.height = height;
        this.len = len;
        this.wid = wid;
    }
    public Box(double side)
    {
        this.height=side;
        this.wid=side;
        this.len=side;
    }
    public Box(Box present)
    {
        this.len=present.len;
        this.height=present.len;
        this.wid=present.wid;
    }
}
