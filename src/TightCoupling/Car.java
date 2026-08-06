package TightCoupling;

public class Car {

     PetrolEngine pe;
     public  Car()
        {
            pe=new PetrolEngine();

        }
        public void move()
        {
            System.out.println("Car moves with:");
            pe.show();
        }
}
