package ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.util.Arrays;

public class ProductMain {
    public static void main(String[] args) throws Exception {
        Product pr=new Product("dryer",2000,"20-04-2026");
        Class c= Class.forName("ReflectionApi.Product");
        Method[]methods=c.getDeclaredMethods();
        for(Method m:methods)
        {
            System.out.println(m.getName());

        }
        System.out.println(c.getName());

        Constructor <?>[]constructor=c.getConstructors();
        System.out.println(constructor[0]);
        System.out.println(Arrays.toString(c.getClasses()));
        System.out.println(c.getSuperclass().getName());

        @Deprecated
        Product pm= (Product) c.newInstance();
//        Method []m=c.getDeclaredMethods();
//        for(Method method:m)
//        {
//            method.setAccessible(true);
//            method.invoke(pm,null);
//        }
        Method m1=c.getDeclaredMethod("getName",String.class);
        m1.setAccessible(true);
        System.out.println(m1.invoke(pm,"java"));
        Field f=c.getDeclaredField("name");
        System.out.println(f.getType().getName() );
        Constructor cm=c.getConstructor();
        cm.setAccessible(true);
        Product p2= (Product) cm.newInstance();
        System.out.println(cm.isSynthetic());
//        p2.

    }
}
//here we cannot access the getters and even the fields of class product they have private scope so they are available
//only in the class not outside of it
//but we have a concept called reflection through which we can access anything from the class
//getInstance is used the instance of that class
// by which we can call/invoke even private Methods private Constructors and even private fields
//can be accessed first we need to setAccessible as true