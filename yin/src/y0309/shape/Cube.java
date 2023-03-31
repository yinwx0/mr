package y0309.shape;

public class Cube extends Rectangle{
    double height;

    public Cube(double x,double y,double height){
        super(x,y);
        this.height=height;
    }

    public void volume(){
        System.out.println("矩形的体积为："+this.x*this.y*this.height);
    }
}
