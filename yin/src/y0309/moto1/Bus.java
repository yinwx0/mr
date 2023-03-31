package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
public final class Bus extends MotoVehicle {

    public int seatCount;

    public Bus() {
        super();
    }

    public Bus(String no, String brand, int seatCount) {
        super(no, brand);
        this.seatCount = seatCount;
    }

    @Override
    public int calRent(int days) {
        int sum = 0;
        if (seatCount <= 16) {
            sum = 800 * days;
        } else if (seatCount > 16) {
            sum = 1500 * days;
        }
        return sum;
    }
}

