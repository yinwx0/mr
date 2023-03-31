package shape;

public class Rectangle extends Shape{
    double C,S;//C为周长，S为面积
    public  Rectangle(){
        super(1,2);
        C = 2*(a + b);
        S = a*b;
    }

    @Override
    public String toString() {
        return "Rectangle : "
                + "C=" + C
                + ", S=" + S;
    }
}
