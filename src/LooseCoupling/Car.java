package LooseCoupling;

public class Car {
    Engine e;
    public Car(Engine e)
    {
        this.e=e;
    }
    public void move()
    {
        System.out.println("Car moves with:");
        e.show();
    }
}
