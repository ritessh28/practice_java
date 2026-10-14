package Oops.InnerClass;
abstract class Animal
{
    String name="elephant";
    public void makeSound()
    {
        System.out.println("animal is making sound");
    }
    abstract void eat();

}
public class AnonymousClass {
    public static void main(String[] args) {
        Animal al=new Animal(){
           String name="tiger";
          @Override
          public void makeSound()
          {
              System.out.println("animal sound");
              this.eatingFood();
          }
          public void eatingFood()
          {
              System.out.println("Animal " +name+" is eating food");
              System.out.println(this.name);
          }
          public void eat()
          {
              System.out.println("eating food");
          }
        };
        al.makeSound();
        al.makeSound();
        al.eat();
        System.out.println(al.name);
//        Animal a2=new Animal();
//        a2.makeSound();

    }
}
// anonymous class is a class without any name
// and is instantiated and defined at the same time as above
// it doesnt instantiate abstract class/ interface behind the scenes compiler
//  compiler creates a class with outer class name$1 in our case Animal$1 and extends if it is abstract class
// and implements if interface and can extend only one class or one interface not both
// and at last does like normal object assignment class $animal1=new abstract class/interface
// but class name is hidden only for compiler
// it compiles .class file only