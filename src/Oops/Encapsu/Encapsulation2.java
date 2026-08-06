package Oops.Encapsu;
class Animal {
    private String name;
    private String habitat;
    private String food;
    void setAnimalDetails(String name, String habitat, String food)
    {
        this.name = name;
        this.habitat = habitat;
        this.food = food;
    }
    void getAnimalDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Habitat: "+habitat);
        System.out.println("Food: "+food);
    }
}
public class Encapsulation2 {
    public static void main(String[] args) {
            Animal a = new Animal();
            a.setAnimalDetails("Dog","Human Homes/Yards","Dog Food");
            a.getAnimalDetails();
    }
}
