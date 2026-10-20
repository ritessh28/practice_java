package Java8.LambdaExpression;

import java.util.function.*;

public class PrimitiveTypeInterface {
    public static void main(String[] args) {
        //takes primitive int as argument and returns object of type<T> function
        IntFunction<Integer>sum=(a)->a+10;
        System.out.println(sum.apply(10));
        //takes object of type<T> and returns primitive long
        ToLongFunction<Integer>mul=(a)->a* 10L;
        System.out.println(mul.applyAsLong(10));
        //accepts primitive as an argument and does not return anything consumer
        IntConsumer printValue=(a)-> System.out.println("value is "+a);
        printValue.accept(900);
        //does not take any argument just returns the value in primitive type while returning supplier
        IntSupplier squareof10=()->10*10 ;
        System.out.println("square of 10 is "+squareof10.getAsInt());
        //takes primitive type as an argument and returns boolean type predicate
        IntPredicate EvenOrOdd=(a)->a%2==0;
        System.out.println(EvenOrOdd.test(29));
        //IntUnary operator takes only one int value as an argument and return int primitive itself
        //for two arguments use Binary
        IntUnaryOperator addTen=(a)->a+10;
        System.out.println(addTen.applyAsInt(200));
        //IntBinary operator takes two  int  as an argument and return int primitive itself
        //useful for 2 inputs
        IntBinaryOperator sumof2=(a,b)->a+b;
        System.out.println(sumof2.applyAsInt(10,20));
        System.out.println(sumof2.applyAsInt(30,40));
    }
}
