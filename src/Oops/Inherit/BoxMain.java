package Oops.Inherit;

public class BoxMain {
    public static void main(String[] args) {
//        Box obj=new Box();
//        Box obj=new Box(2);
        Box obj=new Box(2,4,8);
//        System.out.println(obj.len+" "+obj.wid+" "+obj.height);
//        Box obj2=new Box(obj);
//        System.out.println(obj2.len+" "+obj2.wid+" "+obj2.height);
//        WeightBox bx=new WeightBox(23.0,4,5,6);
//        System.out.println(bx.weight+" "+bx.wid+" "+bx.height+" ");
        WeightBox b=new WeightBox();
        System.out.println(((WeightBox) b).weight+" "+b.wid+" "+b.height+" ");
        WeightBox b2=new WeightBox(b);
        System.out.println(b.len+" "+b.wid+" "+b.weight+" "+b.height);
        BoxPrice ob=new BoxPrice();
        System.out.println(ob.len+" "+ob.wid+" "+ob.weight+" "+b.height+" "+ob.cost);


    }
}
