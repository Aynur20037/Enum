package Test2;

public class Test {
    public static void main(String[] args) {
        for( TrafficLight trafficLight : TrafficLight.values()) {
            System.out.println(  "Цвет : " + trafficLight.getColor());
            System.out.println(trafficLight.getSeconds() + " секунд ");
        }
    }
}
