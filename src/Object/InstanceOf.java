package Object;

public class InstanceOf {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Bike b=new Bike();
        System.out.println(v instanceof Bike);
        System.out.println(b instanceof Bike);
        System.out.println(b instanceof Vehicle);
        System.out.println(b.getClass().getName());
        System.out.println(v.getClass().getName());

    }
}
class Vehicle
{

}
class Bike extends Vehicle
{

}
// instance of checks if an object is an instance of a particular class or any of its sub class
// getClass() returns runtime class of an object
