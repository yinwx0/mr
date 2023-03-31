package fan;

import java.time.Year;

public class FanTest {
    public static void main(String[] args) {
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();
    fan1.setSpeed(3);
    fan1.setRadius(10);
    fan1.color = "yellow" ;
    fan1.setOn(true);

    System.out.println(fan1.toString());
    System.out.println();

    fan2.setSpeed(2);
    fan2.setRadius(5);
    fan2.color = "blue";
    fan2.setOn(false);
    System.out.println(fan2.toString());


}
}
