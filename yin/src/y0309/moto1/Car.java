package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
public final class Car extends MotoVehicle {

    private String type;

    public Car() {
        super();
    }

    public Car(String no, String type) {
        super(no);
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calRent(int days) {
        int sum = 0;
        if ("宝马550i".equals(type)) {
            sum = 500 * days;
        } else if ("别克商务舱GLB3".equals(type)) {
            sum = 600 * days;
        } else if ("别克林荫大道".equals(type)) {
            sum = 300 * days;
        }
        return sum;
    }
}
