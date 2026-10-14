package Enum;
enum Operation
{
    ADD(){
        public int apply(int a,int b)
        {
            return a+b;
        }
    },
    SUBTRACT()
            {
                public int apply(int a,int b)
                {
                    return a-b;
                }
            },
    MULTIPLY()
            {
                public int apply(int a,int b)
                {
                    return a*b;
                }
            },
    DIVISION()
            {
                public int apply(int a,int b)
                {
                    return a/b;
                }
            };
    public abstract int  apply(int a,int b);
}
public class Calculator {
    public static void main(String[] args) {
//        Operation a1=Operation.ADD;
//        System.out.println(a1.apply(2,4));
        for(Operation p1:Operation.values())
        {
            System.out.println(p1.name()+"  "+p1.apply(6,2));
        }
    }

}