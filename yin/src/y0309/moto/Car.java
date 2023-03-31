package y0309.moto;

public class Car extends MotoVehicle{

    final String type;    //型号

    public Car(int no, String brand,String color, int mileage, String type) {
        super(no, brand,color, mileage);
        this.type = type;
    }


    @Override
    public void CalcRent(int days) {
        switch (no){
            case 1 : System.out.println("租售价为： "+days*600);break;
            case 2 : System.out.println("租售价为： "+days*500);break;
            case 3 : System.out.println("租售价为： "+days*300);break;
            default: System.out.println("查无此车");
        }

    }

}
