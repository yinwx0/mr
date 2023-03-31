package pet;

public class Cat implements Pet{
    String name;
    String color;
    int age;


    public Cat(String name,String color,int age){
        this.name  = name;
        this.color = color;
        this.age   = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAge() {
        return age;
    }
}
