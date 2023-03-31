package circle;

public class Circle {
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;

    }

    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }

    public void disp(){
        System.out.println("圆的半径为："+radius+"圆的周长为："+getPerimeter()+"圆的面积为："+getArea());
    }
}
