package test;

public class Employee {
    int number ;
    String name;
    int money;
    int increse;


    public Employee(int number,String name, int money, int increse){
        this.number=number;
        this.name = name;
        this.money = money;
        this.increse =increse;
    }

    public int getMoney(){
       return money+increse;
    }

    public static void main(String[] args) {
        System.out.println("计算增长后的工资总额："+new Employee(10,"yin",5000,2000).getMoney());
    }
}
