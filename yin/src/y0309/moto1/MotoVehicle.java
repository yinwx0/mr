package y0309.moto1;

/**
 * @author
 * @version 1.0
 * @data 2023/3/2 13:57
 */
//抽象类
public abstract class MotoVehicle {
    //属性
    private String no;
    private String brand;
    private String type;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MotoVehicle() {
    }

    public MotoVehicle(String no) {
        this.no = no;
    }

    public MotoVehicle(String no, String brand) {
        this.no = no;
        this.brand = brand;
    }

    public abstract int calRent(int days);
}
