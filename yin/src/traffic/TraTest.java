package traffic;

import java.util.Scanner;

public class TraTest {
    public static void main(String[] args) {
        Express express1 = new Express("HYX600235",76.34);
        Car car = new Car(1,"大奔","小韩");
        express1.before();
        System.out.println("====================");
        express1.middle(car.name, car.number, car.type);
        System.out.println("====================");
        express1.behind(car.name, car.number, car.type);
        car.maintain();
    }
}
