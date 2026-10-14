package Enum;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println(Day.describeDay(Day.MONDAY));
        System.out.println(Day.describeDay(Day.SUNDAY));
        System.out.println(Day.describeDay(Day.MONDAY));
    }
}
enum Day
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public static String describeDay(Day d)
    {
        switch (d)
        {

            case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,
                 FRIDAY:
                return "weekday";
            case SATURDAY,SUNDAY:
                return "weekend";

        }
        return "invalid";
    }
}



