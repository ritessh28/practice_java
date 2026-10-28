package Java8.optionalClass;

public class WhyOptionalTransformation {
    public static void main(String[] args) {
        Address address=new Address("goa");
        User user=new User(address);
        if(user!=null)
        {
            if(address!=null)
            {
                System.out.println(address.city);
            }
        }
        User user1=getUser();
        if(user1!=null)
        {
            if(user1.address!=null)
            {
                System.out.println(user1.address.city);
            }
        }
//        System.out.println(getUser().address.city);


    }
    public static User getUser()
    {
        return new User(null);
    }
}
class User
{
    Address address;
    public User(Address address)
    {
        this.address=address;
    }

}
class Address
{
    String city;
    public Address(String city)
    {
        this.city=city;
    }
}
//so the problem with normal class is that if we want to perform some operations on an object of a particular class and
// the class itself hold reference of another object in its class which in turn hold reference of other class object
//and suppose even if a single class mistakenly has null value then if we perform operations on them, we  get null pointer
//exception and the program terminates abnormally so to have no more null comparison or check unnecessary null comparison
// hell we have optional class which binds the object in optional class we cannot have direct access to the object/value
//it returns Optional<T> so it should be stored in that only there are multiple methods through which we can get the value
//or give default value when it is assigned as null so our comparison isn't necessarily needed even it can have null
//as value and if we directly try to get that null value we get no such element exception