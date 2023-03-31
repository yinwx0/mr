package fan;

public class Fan {

    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";


    public void slow() {
}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //无参构造方法
    public Fan(){
    }

    @Override
    public String toString() {
        if(on == true){
        return "Fan{" +
                "speed=" + speed +
                ", color='\" + color \",radius=" + radius +
                 + '\''
                ;}
        else{
            System.out.println("fan is off");
            return "radius=" + radius +
                    ", color='" + color + '\''
                    ;
        }
    }
}
