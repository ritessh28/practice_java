class Animal1{
    String name;
    Animal1(String name){
        this.name = name;
        System.out.println("1)Animal name = " + name);
    }
    Animal1(){
        System.out.println("3)........");
    }
}
class Mammal2 extends Animal1{
    int legs;
    Mammal2(String name, int legs){
        super(name);
        this.legs=legs;
        System.out.println("2)Mammal constructor called " +name+" has "+legs+ " legs.");
    }
    Mammal2(String name) {
        super(name);
        System.out.println("4)//////////////////");
    }
}
class Dog1 extends Mammal2{
    String breed;
    Dog1(String name,int legs,String breed){
        super(name,legs);
        this.breed=breed;
        System.out.println("5)Dog constructor called "+name+ " has "+breed+ " breed");
    }
    Dog1(String name,int legs){
        super(name,legs);
        System.out.println("6)'''''''''''");
    }
}
public class Dog2 extends Dog1{
    Dog2(String name,int legs,String breed){
        super(name,legs,breed);
        System.out.println("6)this is a dog main class");
    }
    public static void main(String[] args) {

        Dog2 dog=new Dog2("buddy",4,"golden retriver");
        Mammal2 d=new Dog1("buddy",4);


    }
}
