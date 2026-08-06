package Oops.Constructor;
class Vehicle
{
    String type;
    int maxSpeed;
    Vehicle(String type,int maxSpeed)
    {
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    Vehicle()
    {
        System.out.println("Vehicle() non parameterized consructor");
    }
}
class Car extends Vehicle
{
    String trans;
    Car (String trans)
    {
//        super("4w",300);
        this.trans=trans;
    }
    Car(String type,int maxSpeed,String trans)
    {
        super(type,maxSpeed);
//        this(trans);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Car c=new Car("4W",300,"auto");
//        Car c1=new Car("manual");
        System.out.println(c.type);
        Car c2=new Car("Manual");
        System.out.println(c2.trans);


    }
}
