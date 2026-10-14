package Oops.MethodOver;
class Validator {
    // 1. Validate that an int is positive
    boolean validate(int number) {
        System.out.println("inside int method");
        return number > 0;
    }

    // 2. Validate that a String is non-empty (length > 0 after trim)
    boolean validate(String text) {
        if (text.trim().length() > 0)
            return true;

         return false;
}

    // 3. Validate that a String's length is within a min/max range
    boolean validate(String text, int min, int max)
    {
        if(text.length()>=min&&text.length()<=max)
            return true;
        return false;
    }

    boolean validate(double number, double max)
    {
        System.out.println("inside 2-double args");
        if(number<=max&&number>=0.0) {
            return true;
        }
        return false;
    }

    // 5. Validate an array of ints — all must be positive
    boolean validate(int[] numbers)
    {
        System.out.println("inside array method");
        boolean res=true;
        for(int i:numbers)
        {
            if(i<0)
            {
                res=false;
                break;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Validator obj=new Validator();
        System.out.println(obj.validate('A'));
        System.out.println(obj.validate(10,2));
    }
}