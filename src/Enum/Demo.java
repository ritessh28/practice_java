package Enum;

public class Demo {
    public static void main(String[] args) {
        Direction d1=Direction.NORTH;
        Direction d2=Direction.NORTH;
        System.out.println(d1);
        System.out.println(d1==d2);//true because d1 and d2 points to North Object
    }
}
// Enum --> Enumerations ( Enumerated type)
// Enum --> Predefined set of constants.
enum Direction
{
    NORTH,
    SOUTH,
    EAST,
    WEST;
};
//jvm compiles enums as class enum is a class
// it extends enum from java.lang
// class Direction extends Enum <generics>
// by default each constant object  in enum is final static
// so we can access it with enum.constant name Direction.South
// it has private constructor in it
// so we cannot declare object of enum in different class
// because of  private constructor
// each constant in enum is of type enum only
// in our example
//public static final Direction NORTH=new Direction();
// same for each constants
// each constant point to a separate object in heap
/* Direction d1=Direction.NORTH;
   Direction d2=Direction.NORTH;
   System.out.println(d1);
   System.out.println(d1==d2);//true*/