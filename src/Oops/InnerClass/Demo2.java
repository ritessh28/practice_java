package Oops.InnerClass;
interface Display
{
    public void display();
//    public void show();

}
interface Show
{
    int add(int a,int b);
}
interface DisplayEmployee
{
    String displayEmployee(String name);
}
public class Demo2 {
    public static void main(String[] args) {
        Display d=new Display() {
            @Override
            public void display() {
                System.out.println("display method ");
            }
        };
        Display d1=()->
        {
            System.out.println("in new display method");
        };
        d1.display();
        Show obj=(a,b)-> a+b;
        int ans=obj.add(4,6);
        System.out.println(ans);
        DisplayEmployee db=(name)->
        {
            return name;
        };
        System.out.println(db.displayEmployee("ritesh"));
    }
}
