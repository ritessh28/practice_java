package Oops.MethodOver;

import javax.sound.midi.Instrument;

class InstruMent
{

}
class MusicalInstrument extends InstruMent
{

}
public class MethodOver5
{
    public void m1(MusicalInstrument m)
    {
        System.out.println("Inside method MusicalInstrument");
    }
    public void m1(InstruMent i)
    {
        System.out.println("Inside method Instrument");
    }
    public static void main(String[] args)
    {
        MethodOver5 obj=new MethodOver5();
        InstruMent m=new InstruMent();
        obj.m1(m);
        MusicalInstrument mi=new MusicalInstrument();
        obj.m1(mi);
        InstruMent mi2=new MusicalInstrument();
        obj.m1(mi2);

    }
}