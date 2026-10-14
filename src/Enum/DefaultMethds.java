package Enum;

public class DefaultMethds {
    public static void main(String[] args) {
        Direction4 d1=Direction4.EAST;
        Direction4 []directions=Direction4.values();
        for(Direction4 di:directions)
        {
            System.out.println(di.name());
        }
        System.out.println(d1);
        System.out.println(Direction4.EAST);
        System.out.println(Direction4.valueOf("EAST"));
        int indx=d1.ordinal();
        int idx=Direction4.WEST.ordinal();
        System.out.println(indx+" "+idx);
    }

}
enum Direction4
{
    NORTH,
    SOUTH,
    EAST,
    WEST;

};
// default methods of enum
/* 1. values(): returns an  array with enum constant object we can iterate through enum
   2. valueOf():convert a string into an enum constant
   3. name:returns the particular name of enum constant object similar to toString() but cannot override it
   4. ordinal:returns the index of enum constant from starting 0th index
   5. toString(),hashCode(),equals() ,clone() are final we cannot override

 */
