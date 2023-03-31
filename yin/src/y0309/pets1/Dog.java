package y0309.pets1;

public class Dog extends Pet {
    private String strain;    //品种

    public Dog(String name, String strain) {
        super(name);
        this.strain = strain;
    }

    @Override
    public void print() {
        System.out.println("宠物的自白：姓名"+super.getName()+",健康值："+super.getHealth()+
                ",品种："+this.strain);
    }

    @Override
    public void cure() {
        System.out.println("打针");
        System.out.println("吃药");
//       修改健康值
        super.setHealth(getHealth()-10);
    }
//    狗狗所特有的方法
    public void playWithDis(){
        System.out.println("狗狗"+this.getName()+"正在玩飞盘");
        this.setHealth(this.getHealth()+5);
    }


    @Override
    public void eat() {
        System.out.println("狗狗吃狗粮");
    }

}
