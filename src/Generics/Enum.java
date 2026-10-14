package Generics;

public class Enum {
    public static void main(String[] args) {
        Operation op=Operation.SUB;
        System.out.println(op.operation(2,3));
        System.out.println(Operation.DIV.operation(2.0,4.0));
    }

}
enum Operation
{
    ADD,SUB,MUL,DIV;
    public <T extends Number> double operation(T a,T b)
    {
       switch (this)
       {
           case ADD :
               return a.doubleValue()+b.doubleValue();
           case SUB :
               return a.doubleValue()-b.doubleValue();
           case MUL :
               return a.doubleValue()*b.doubleValue();
           case DIV :
               return a.doubleValue()/b.doubleValue();
           default:
               throw new AssertionError("DID NOT MATCH"+this);
       }

    }
}