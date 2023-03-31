package y0309.shape;

public class Triangle extends Shape{

    public Triangle(double x, double y) {
    super.x=x;
    super.y=y;
    }
    @Override
    public void area() {
        System.out.println("三角形的面积为："+this.x*this.y*0.5);
    }


}
