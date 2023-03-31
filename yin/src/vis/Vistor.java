package vis;

public class Vistor {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(name+"的年龄为："+age);
        if (age>=18){
            System.out.println("门票价格为："+20+"元");
        }else {
            System.out.println("门票免费");
        }
    }
}
