package Oops.Abstract;
abstract class Earphone
{
    void listening()
    {
        System.out.println("Listening on Earphone");
    }
    abstract void connectionThrough();
}
class WiredEarphone extends Earphone
{
    public void connectionThrough()
    {
        System.out.println("Connecting through cod Wired Earphone");
    }
}
class WirelessEarphone extends Earphone
{
    public void connectionThrough()
    {
        System.out.println("Connecting through Bluetooth");
    }
}
public class Abstraction2 {
    public static void main(String[] args)
    {
        Earphone w= new WiredEarphone();
        w.listening();
        w.connectionThrough();
        w=new WirelessEarphone();
        w.listening();
        w.connectionThrough();

    }

}
