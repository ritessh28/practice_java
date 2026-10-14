package Generics;
interface Container1<T>
{
    void set(T s);
    T get();
}
class ClassContainer implements Container1
{
        Object s;
        public ClassContainer(Object s)
        {
            this.s=s;
        }
        @Override
        public void set(Object s)
        {
            this.s=s;
        }

    @Override
    public Object get() {
        return this.s;
    }
}
class StringContainer implements Container1<String>
{
    String item;
    @Override
    public void set(String item)
    {
        this.item=item;
    }
    @Override
    public String get()
    {
        return item;
    }
}
class GenericContainer<T> implements Container1<T>
{
    T item;
    public GenericContainer(T item)
    {
        this.item=item;
    }
    public GenericContainer()
    {

    }
    @Override
    public void set(T item)
    {
        this.item=item;
    }
    @Override
    public T get()
    {
        return item;
    }

}
class NumberContainer implements Container1<Number>
{
    Number item;
    public NumberContainer(Number item)
    {
        this.item=item;
    }
    @Override
    public void set(Number item)
    {
        this.item=item;
    }
    @Override
    public Number get()
    {
        return item;
    }
}
public class GenericInterface {
    public static void main(String[] args) {
        ClassContainer c1=new ClassContainer(123);
        System.out.println(c1.get());
        ClassContainer c2=new ClassContainer("ritesh");
        System.out.println(c1.get());
//        System.out.println(c1.s.);
        StringContainer sc=new StringContainer();
        sc.set("31");
        System.out.println("string container class:"+sc.get());
        GenericContainer<String > gc=new GenericContainer<>();
        gc.set("ramesh");
        System.out.println("generic container class:"+gc.get());
        GenericContainer<Integer> gc1=new GenericContainer<>(90);
        System.out.println("generic container class:"+gc1.get());
        NumberContainer n1=new NumberContainer(10);
        System.out.println("Number container class:"+n1.get().doubleValue());
//        NumberContainer n2=new NumberContainer((Number) new Object());
//        System.out.println(n2.get());
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.Number (java.lang.Object and java.lang.Number are in module java.base of loader 'bootstrap')
        //	at Generics.GenericInterface.main(GenericInterface.java:97)


    }
}
// in this example we are creating an interface with generic type
// but while implementing that we are not providing any generic type after interface name so
// it can except any type of object
// as Object is accepted as argument in parameters and even in constructors
// because object can store any type of object
// if we want to accept only specific object we can specify it after interface name like <String>
// in the string container class it can except only string type of values
// cause we have provided String as generic after implements
// if we want to have generic type as parameter for class implementing a interface we can use type parameter
// for class which accepts a generic type which can also be used as a generic for interface type
// refer class GenericContainer which can accept any type of class
// if we want to accept class of number and its subtype we can use <Number> as generic type
