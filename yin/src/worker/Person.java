package worker;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;//姓名
        this.age = age;//年龄
    }

    @Override
    public String toString() {
        return "Person : "
                + "\n" + "name:" + name
                + ", age:" + age;
    }
}
