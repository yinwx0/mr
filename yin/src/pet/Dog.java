package pet;

public class Dog implements Pet{
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
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
