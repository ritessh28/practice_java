package Object;

import java.util.Objects;

public class Method {
    public static void main(String[] args) {
        Employeee e1=new Employeee(2,"ritesh");
        Employeee e2=new Employeee(2,"ritesh");
        Employeee e3=new Employeee(3,"ritesh");
        System.out.println(e1.equals(e2));
        System.out.println(e1);
        System.out.println(e1.hashCode()+" "+e2.hashCode());
        System.out.println(e1.hashCode()==e2.hashCode());
        System.out.println(e3.hashCode());

    }
}
class Employeee
{
    int id;
    String name;
    public Employeee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public boolean equals(Object another) {
        if (this == another)
            return true;
        if (another == null || this.getClass() != another.getClass())
            return false;
        Employeee e= (Employeee) another;
        return this.id==e.id&&this.name.equals(e.name);
//        return this.id==e.id&& Objects.equals(this.name,e.name);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(this.id,this.name);
    }
    @Override
    public String toString()
    {
        return "name: "+this.name+" id: "+this.id;
    }
}