package Generics;

public class WhyGenerics2 {
    public static void main(String[] args) {
        Box obj=new Box(2);

    }
}
class Box
{
    int value;
    public Box(int value)
    {
        this.value=value;
    }
    public void setValue(int value)
    {
        this.value=value;
    }
    public int getValue()
    {
        return value;
    }
}
//problem with this approach is we can pass only integer value if we need to pass suppose string value to store in box
// or double value we need to create another field with required data type
// and code becomes lengthy
// so if we need to decide which parameter to pass at the time of object creation
// if we want to pass different parameter inside single class
// we can achieve it through method overloading but with different parameters
// but if we want to store it in single field then it isnt possible
// we can achieve it through generics
// More precisely: the generic type parameter T is decided once, at the point of object creation (Box<String> b = new Box<>("hello");),
// and from then on, that specific Box instance is locked to String only. Different instances of Box can each hold a different type — B
// box<Integer> and Box<String>
// can coexist — but any single instance is fixed to one type for its whole lifetime, enforced at compile time.
// only reference types are allowed in generics
// in collection also we use generic class so
// it can store data of a specific type
