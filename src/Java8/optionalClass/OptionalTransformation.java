package Java8.optionalClass;

import java.util.Optional;

public class OptionalTransformation {
    public static void main(String[] args) {
//        Address1 address = new Address1("goa");
//        User1 user = new User1(address);
        Optional<User> user=getUser();
        user.map(s->s.address)
                .map(n->n.city)
                .ifPresentOrElse(System.out::println,()->System.out.println("java"));
        System.out.println("***********");
        Optional<String> name=Optional.ofNullable("ritesh");
        name.filter(s->s.length()>2)
                .ifPresent(System.out::println);
//



    }

    public static Optional<User> getUser() {
        User user=new User(new Address("goa"));
        return Optional.ofNullable(null);
    }
}
class User1
{
    Address1 address;
    public User1(Address1 address)
    {
        this.address=address;
    }

}
class Address1
{
    String city;
    public Address1(String city)
    {
        this.city=city;
    }
}
//with this approach we can avoid null completely