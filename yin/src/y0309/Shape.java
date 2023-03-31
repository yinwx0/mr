package y0309;

public abstract class Shape {
    public abstract void area();
    public abstract void perimeter();

}

class Circle extends Shape{

    private double r;

    public Circle(int r) {
        this.r=r;
    }

    @Override
    public void area() {
        System.out.println("面积为： "+Math.PI*Math.pow(r,2));
    }

    @Override
    public void perimeter() {
        System.out.println("周长为： "+2*r*Math.PI);
    }

    public static void main(String[] args) {
        Shape circle = new Circle(2);
        circle.area();
        circle.perimeter();
    }
}

class triangle extends Shape{
    private double a;
    private double b;
    private double c;
    private double high;

    public triangle(double a, double b,double c,double high) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.high = high;
    }
    @Override
    public void area() {
        System.out.println("面积为： "+a*b*0.5);
    }

    @Override
    public void perimeter() {
        System.out.println("周长为： "+(a+b+c));
    }

    public static void main(String[] args) {
        Shape triangle = new triangle(1,2,3,4);
        triangle.area();
        triangle.perimeter();
    }
}


