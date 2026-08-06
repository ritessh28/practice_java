package Oops.Inherit;
class Vehicle
{
    void vehicle()
    {
        System.out.println("Vehicle is mode of Road Transportation");
    }
}
interface Driving
{
    void drive();
}
interface Acceleration
{
    void acceleration();
}
interface Gear
{
    void gear();
}

class Car extends Vehicle implements Driving,Acceleration
{
    public void drive()
    {
        System.out.println("Driving a car");
    }
    public void acceleration()
    {
        System.out.println("accelerating a car");
    }
    public void gear()
    {
        System.out.println("Changing gear of car");
    }
}
class Bus extends Car implements Driving,Acceleration
{
    @Override
    public void drive() {
        System.out.println("Driving a bus");
    }
    @Override
    public void acceleration() {
        System.out.println("accelerating a bus");
    }
}
public class Hybrid3 {
    public static void main(String[] args)
    {
        Bus b=new Bus();
        b.drive();
        b.gear();



    }
}
