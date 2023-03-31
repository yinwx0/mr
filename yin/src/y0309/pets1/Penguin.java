package y0309.pets1;

public class Penguin extends Pet {
    private String sex;

    public Penguin(String name, String sex) {
        super(name);
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("企鹅在吃干粮");
    }

    @Override
    public void print() {
        System.out.println("宠物的自白：姓名"+super.getName()+",健康值："+super.getHealth()+
                ",性别："+this.sex);
    }

    @Override
    public void cure() {
        System.out.println("吃药");
        System.out.println("疗养");
        super.setHealth(getHealth()-5);
    }

    public void swimming(){
        System.out.println("企鹅"+this.getName()+"正在游泳");
        this.setHealth(this.getHealth()+10);
    }
}
