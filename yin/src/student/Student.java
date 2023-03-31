package student;

public class Student <T,V>{

    private T no;
    private V name;

    public Student(T no,V name){
        this.no = no;
        this.name = name;
    }

    public T getNo() {
        return no;
    }

    public void setNo(T no) {
        this.no = no;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name=" + name +
                '}';
    }
}
