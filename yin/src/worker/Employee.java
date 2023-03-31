package worker;

public class Employee extends Person{
    private int no;//工号
    private int wages;//工资
    public Employee(int no,int wages){
        super("C",20);
        this.no = no;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return  "no:" + no
                + ", wages:" + wages;
    }
}
