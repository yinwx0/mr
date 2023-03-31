package y0309.moto;

public abstract class MotoVehicle {

    final int no;          // 车牌号
    final String brand;    //品牌
    final String color;
    final int mileage;     //里程

    public MotoVehicle(int no,String brand,String color,int mileage){
        this.no      = no;
        this.brand   = brand;
        this.color   = color;
        this.mileage = mileage;
    }

    public abstract void CalcRent(int days);
}
