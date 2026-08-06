package LooseCoupling;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.move();

    }
}
