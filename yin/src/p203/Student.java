package p203;

public class Student extends Person{
    private double math;
    private double english;
    public Student(){}
    public Student(double math, double english) {
        this.math = math;
        this.english = english;
    }

    public Student(String name, String address, char sex, int age, double math, double english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return super.toString().replace("Person","Student").replace("}"," ,") +
                "math=" + math +
                ", english=" + english +
                '}';
    }
}
