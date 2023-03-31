package person;

public class Person {
    private String name;
    private String address;
    private char sex;
    private int age;

    public Person(String name,String address,char sex,int age){ }

    public Person(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Person("张三","北京二胡同", '男',20).toString());
    }
}
