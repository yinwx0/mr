package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
public class Truck extends MotoVehicle {
    public int tonnage;

    public Truck() {
        super();
    }

    public Truck(String no, String brand, int tonnage) {
        super(no, brand);
        this.tonnage = tonnage;
    }

    @Override
    public int calRent(int days) {
        int sum = 0;
        sum = tonnage * 50 * days;
        return sum;
    }
}
