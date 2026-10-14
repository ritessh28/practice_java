package Enum;

public class EnumExample {
    public  static void main(String[] args) {
//        Planet p1=Planet.EARTH;
//        System.out.println(p1.surfaceGravity());
        Planet []Planets=Planet.values();
        for(Planet p:Planets)
        {
            System.out.println(p.name());
            System.out.println(p.surfaceGravity());
        }
    }
}
enum Planet
{
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);
    private final double mass,radius ;
    Planet(double mass,double radius)
    {
        this.radius=radius;
        this.mass=mass;
    }
    private static final double G=6.67300E-11;
    public double surfaceGravity()
    {
        return  G * mass / (radius * radius);
    }

}