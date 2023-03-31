package worker;

public class Manager extends Employee {
    private String job;
    public Manager(String job){
        super(8,8888);
        this.job = job;
    }

    @Override
    public String toString() {
        return "job:" + job;
    }
}
