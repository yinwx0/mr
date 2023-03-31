package y0309.moto;

public class Bus extends MotoVehicle{

    final int SeatCount;

    public Bus(int no, String brand,String color, int mileage,int seatCount) {
        super(no,brand,color,mileage);
        this.SeatCount = seatCount;
    }

    @Override
    public void CalcRent(int days) {
        if(SeatCount <= 16){
            System.out.println("租售价为： "+days*800);
        }else  System.out.println("租售价为： "+days*1500);
    }
}
