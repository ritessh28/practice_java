package String;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ritesh");
        StringBuffer s2=new StringBuffer();

        System.out.println(sb.capacity());//16+6==22
        sb.append("how are you my friend hope you are fine");
        System.out.println(sb.capacity());
        System.out.println(sb.deleteCharAt(0));
//        System.out.println(sb);
        System.out.println(sb.indexOf("h"));
        System.out.println(sb.delete(0,9));
        sb.trimToSize();
        System.out.println(sb.capacity());
        sb.ensureCapacity(200);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.getClass());
        System.out.println(sb.indexOf("hope"));
        System.out.println(sb.insert(17 ," brother"));
        System.out.println(sb.reverse());


    }
}
//1.when the string builder object is created initial value assigned is 16+ the data we add
//2. it gets increases when the initial capacity begins to occupy full space
//3. sb.ensureCapacity(200); ensures that the capacity will be the assigned value not less or more
//4. sb.trimToSize(); trims the capacity to the content available in string builder
//5. StringBuilder and StringBuffer both are same
//6. StringBuilder is faster than StringBuffer because StringBuffer is thread safe
//7. StringBuffer and StringBuilder extends AbstractStringBuilder
//8.
/*The only real difference between StringBuilder and StringBuffer at the override level is that StringBuffer re-declares
the mutating methods with synchronized, while StringBuilder just inherits AbstractStringBuilder's unsynchronized versions.
Since both are final, you can't subclass either — so "derived from" only makes sense going up to AbstractStringBuilder,
not sideways between StringBuilder and StringBuffer.*/