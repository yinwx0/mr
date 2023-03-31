package p203;

public class Person {
    private String name;
    private String address;
    private char sex;
    private int age;

    public Person() {
    }

    public Person(String name, String address, char sex, int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name  +
                ", \naddress=\n" + address  +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
