package traffic;

public class Car extends Vehicle implements MainTain{       //专用运输车类

    public Car(int number,String type,String name){
        super(number,type,name);

    }
    @Override
    public void traffic() {

    }

    @Override
    public void maintain() {
        System.out.println("货物运输车辆保养完毕！");
    }
}
