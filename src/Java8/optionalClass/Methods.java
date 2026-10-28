package Java8.optionalClass;

import java.util.Optional;

public class Methods {
    public static void main(String[] args) {
        Optional<String>name=getName();
        //get() method is good and risky at same time cause if the object value is null it returns no such element exception
//        System.out.println(name.get());


//        //ifPresent accepts a consumer to print if present if not throws, no such element exception
//       name.ifPresent(System.out::println);

        //name.isPresent basically returns a boolean value it is a safe check method for get it just works like peek
        //it peeks in the class and checks if present returns true otherwise false
//       if(name.isPresent())
//       {
//           System.out.println(name.get());
//       }

        //safe method for checking if value is present or not take one value as argument to return if it is empty/null
        System.out.println(name.orElse("null value"));

        //similar as orElse just
        //orElse(T other) takes a value, and that value is always created, even when the Optional has a value.
        //orElseGet(Supplier<T> supplier) takes a supplier, and it runs only when the Optional is empty.
        System.out.println(name.orElseGet(()->"java"));

        //ifPresentOrElse is an enhanced version of ifPresent it takes two arguments one as consumer  and
        //another runnable empty action if present we can print the value which is present if not then
        //the default value

        name.ifPresentOrElse(System.out::println,()->System.out.println("unknown"));
//        System.out.println(name.);

        //similar as orElse but in the else part throws exception not default value
        System.out.println(name.orElseThrow());

    }
    public static Optional<String> getName()
    {
//        return Optional.of(null);
        //Optional.of cannot have null as value we need to add real string value it cannot have null
        //if we want to have null as value we can use Optional.ofNullable or Optional.empty
//        return Optional.ofNullable(null);
        //if we want to treat the value as null or nothing we can use empty it does not accept any argument
//        return Optional.empty();
        return Optional.ofNullable(null);

    }
}
