package Enum;

public class EnumMethod {
    public static void main(String[] args) {
        Direction1 d1=Direction1.NORTH;
        System.out.println(d1.getDegree(12));
        System.out.println(d1.id);
        Direction1 d2=Direction1.EAST;
        System.out.println(Direction1.id);

    }
}
enum Direction1 //final class Direction1 extends Enum<Direction>
{
    NORTH(0),// public static final Direction NORTH=new Direction(80) same for all
    SOUTH(180),
    EAST(90),
    WEST(270);
    private int degree;
    Direction1(int degree)//private Direction1(int degree) //compiler generated code
    {
        this.degree=degree;
    }
    public<T> int getDegree(T a)
    {
        return degree;
    }
    static int id=10;


}