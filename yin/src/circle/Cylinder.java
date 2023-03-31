package circle;

public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }

    public double getHeight(){
        return height;
    }

    public double getCylinderArea(){
        return height*getPerimeter()+getArea()*2;
    }

    public double getVol(){
        return height*getArea();
    }

    public void dispVol(){
        System.out.println("圆柱体的体积为："+getVol());
    }

}
