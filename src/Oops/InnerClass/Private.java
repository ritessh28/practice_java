package Oops.InnerClass;

public class Private {
    private String name;

    public Private(String name) {
        this.name = name;
    }

     class Inner
    {
        Inner()
        {

        }
        public void display()
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
//        Inner ot=new Inner();
//        ot.display(new Private("ritesh"));
        Private.Inner pi=new Private("ritesh").new Inner();
        pi.display();
        Private p2=new Private("shankar");
        pi.display();
        Private obj=new Private("ritesh");
        System.out.println(obj.name);
        Inner obj2= obj.new Inner();


    }
}
