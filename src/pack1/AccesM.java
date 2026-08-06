package pack1;
import Oops.AcessModifier.*;
public class AccesM extends Demo{
    public static void main(String[] args) {
        AccesM am=new AccesM();
        am.m1();
        am.m2();//protected method
        am.m1();//different package public method
//        am.m3();//not allowed different package default method
    }

}
