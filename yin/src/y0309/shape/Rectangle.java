package y0309.shape;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super.x=x;
        super.y=y;
    }

    @Override
    public void area() {
        System.out.println("矩形的面积为："+this.x*this.y);
    }

}
