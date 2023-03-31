package shape;

public class Triangle extends Shape{
    double c;//三角形第三边
    double C,p,S;//周长，半周长，面积
    public Triangle(double c){
        super(2,2);
        this.c = c;
        C = a+b+c;
        p = C/2;
        S = Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
    }

    @Override
    public String toString() {
        return "Triangle : "
                + "C=" + C
                + ", S=" + S;
    }
}
