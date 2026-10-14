package Enum;

import com.sun.net.httpserver.Authenticator;

public class WhyEnum {
    public static void main(String[] args) {
        PaymentStatus p1=new PaymentStatus();
        int status=p1.SUCCESS;
//        String status2=PaymentStatus.FAILED; doesnt provide type safety
         int type=EngineeringTypes.MECH;
         type=6;
         if(PaymentStatus.SUCCESS==2)
             System.out.println("success");

    }
}
class PaymentStatus
{
    public static final int SUCCESS=1;
    public static final int FAILED=2;
    public static final int PENDING=3;


}
class EngineeringTypes
{
    public static final int  CS=1;
    public static final int  IT=2;
    public static final int  ENC=3;
    public static final int  MECH=4;

}
// payment status --> success, failed, pending
// final

/*
Problems with this approach :
1. Type safety
2. Poor Readability
3. No Grouping or related entities
4. can change the state of variables
5. in enum we define fixed set of constants
6.can be accessed with enumname.objectname
*/