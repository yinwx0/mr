package y0309.moto;

public class CalcRent {

    public static void main(String[] args) {

        MotoVehicle car1 = new Car(1,"别克商务舱","黑",10000,"GL8");
        car1.CalcRent(2);
        MotoVehicle car2 = new Car(2,"宝马","蓝",15000,"550i");
        car2.CalcRent(2);
        MotoVehicle car3 = new Car(3,"别克","黄",20000,"林荫大道");
        car3.CalcRent(2);
        MotoVehicle bus1 = new Bus(4,"金杯","棕",25000,15);
        bus1.CalcRent(2);
        MotoVehicle bus2 = new Bus(5,"金龙","粉",30000,20);
        bus2.CalcRent(2);







    }
}