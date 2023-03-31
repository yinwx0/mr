package quation;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    public  QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double d = (b*b)-(4*a*c);
        return d;
    }

    public double getRoot1(){
        if(d<0){
            return 0;
        }else {
        double e = (double) Math.sqrt(d);
        double r1 = (-b + e)/2*a;
        return r1;
        }
    }

    public double getRoot2() {
        if (d < 0) {
            return 0;
        } else {
            double e = (double) Math.sqrt(d);
            double r2 = (-b - e) / 2 * a;
            return r2;
        }
    }
}