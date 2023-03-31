package traffic;

public abstract class Vehicle {     //交通工具类

    int number;      // 编号
    String type;     // 型号
    String name;     // 运货负责人

    public Vehicle(int number, String type, String name) {
        this.number = number;
        this.type   = type;
        this.name   = name;
    }

    public abstract void traffic();    //抽象运输方法
}
