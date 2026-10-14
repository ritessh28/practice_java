package Enum;

public class AbstractMethods {
    public static void main(String[] args) {
        Direction2 s1=Direction2.NORTH;
        s1.getDegree();
        s1.move();
        s1.behaviour();
        Direction2 d2=s1;
        System.out.println(s1==d2);

    }
}
interface Behaviour
{
    void behaviour();
}
enum Direction2 implements Behaviour
{

    NORTH(80){ //public static final Direction NORTH=new Direction(80){
         //
//            public void move()
//            {
//                System.out.println();
//            }

        // }
        @Override
        public void move()
        {
            System.out.println("move up x+1");
        }
        @Override
        public void behaviour()
        {
            System.out.println("north behaviour");
        }
    },
    SOUTH(160) {
        @Override
        public void move() {
            System.out.println("move down x-1");
        }
        @Override
        public void behaviour()
        {
            System.out.println("south behaviour");
        }

    },
    EAST(0){
        @Override
        public void move() {
            System.out.println("move right y+1");
        }
        @Override
        public void behaviour()
        {
            System.out.println("east behaviour");
        }
    },
    WEST(270){
        @Override
        public void move() {
            System.out.println("move left y-1");
        }
        @Override
        public void behaviour()
        {
            System.out.println("west behaviour");
        }
    };
    private final int degree;
    Direction2(int degree)
    {
        this.degree=degree;
    }
    public int  getDegree()
    {
        return degree;
    }
    public abstract void move();
}