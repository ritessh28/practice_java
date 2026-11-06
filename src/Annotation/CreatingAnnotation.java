package Annotation;

import java.io.Closeable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CreatingAnnotation {
    public static void main(String[] args) {

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Employee
{
    String name() default "ram";
    int id();
    double salary();
}

@Employee(id=2,salary=160000.5)
class Vehicle
{

}
//so basically we can create annotations using @ followed with interface keyword and define methods just like interface but
//notice as we are using @annotation here it is treated as annotation not interface we can even provide default value to
//a field/or can say after method declaration if not provided them we need to provide values while using it above any
//class interface enum methods etc in the bracket after @annotation with (field name =value)
// built in annotations are just present till run time
//if we want to have annotation present at runtime also then we can have them with custom annotation
//just write @Retention(RetentionPolicy.till what you want) runtime via reflection,
//types are CLASS,SOURCE,RUNTIME BY DEFAULT it will be class, class means it is available/stored in .class file not runtime
//and source means it is present in source code only not .class file or at runtime
//and for which java element we can add the annotation is done using @Target(ElementType.method)
//types

/*ElementType.ANNOTATION_TYPE
ElementType.CONSTRUCTOR
ElementType.FIELD
ElementType.LOCAL_VARIABLE
ElementType.METHOD
ElementType.PACKAGE
ElementType.PARAMETER
ElementType.TYPE
ElementType.TYPE_PARAMETER
ElementType.TYPE_USE*/