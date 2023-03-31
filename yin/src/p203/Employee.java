package p203;

public class Employee {
    int id;
    String ename;
    double sal;
    double rate;
    public Employee(String ename, double sal, double rate) {
        this.ename = ename;
        this.sal = sal;
        this.rate = rate;
    }
    public double getGrowthSal(int n){
        return sal * Math.pow(1 + rate,n);
    }
}
