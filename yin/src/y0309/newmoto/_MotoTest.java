package y0309.newmoto;
import java.util.ArrayList;
import java.util.Scanner;
public class _MotoTest {
    public static final Scanner s = new Scanner(System.in);
    public static final ArrayList<String> No = new ArrayList<>();
    public static void main(String[] args)  {
        _MotoVehicle car = new _Car();
        _MotoVehicle bus = new _Bus();
        _MotoVehicle truck = new _Truck();
        String yon;
        System.out.println("欢迎来到模拟租车!");
        do {
            car.toBrands();
            System.out.print("请选择序号: ");
            int _No = s.nextInt();
            System.out.print("租几辆: ");
            int num = s.nextInt();
            System.out.print("输入租车天数: ");
            int days = s.nextInt();
            No.add(_No + "\t" + car.getBrands().get(_No - 1) + "\t" + num + "辆\t" + days + "天" );
            if (_No > 3 && _No < 8) bus.getMotoRentRecords().add(bus.calcRent(days,_No));
            else if (_No >= 8) truck.getMotoRentRecords().add(truck.calcRent(days,_No));
            else car.getMotoRentRecords().add(car.calcRent(days,_No));
            System.out.println("是否继续租车(y/n): ");
            yon = s.next();
        }while (yon.equals("y"));
        System.out.println("租车票据:");
        for (String s:No) System.out.println(s);
        car.allRent();
        System.exit(0);
    }
}
