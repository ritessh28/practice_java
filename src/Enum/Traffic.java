package Enum;
enum TrafficLight
{
    RED,
    YELLOW,
    GREEN;
    public TrafficLight next()
    {
        TrafficLight []trafficLights=TrafficLight.values();
        int nextindex=(this.ordinal()+1)%trafficLights.length;
        return trafficLights[nextindex];
    }
}
public class Traffic {
    public static void main(String[] args) {
        System.out.println(TrafficLight.GREEN.next());
    }
}
