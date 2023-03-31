package person;

public class Student extends Person {
    int math;
    int english;

    public Student(String name,String address,char sex,int age,int math,int english){ }

    public Student(int math,int english){ }

    public Student(){ }

    @Override
    public String toString() {
        return "Student{" +"name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", sex='" + this.getSex() + '\'' +
                ", age=" + this.getAge()  +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Student(80,85).toString());
    }
}
