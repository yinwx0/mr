import java.util.Scanner;

public class Area {
    public static void main (String []args){
        System.out.println("enter the radius and length of a cylinder:");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();
        double length = scan.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("the area is "+area);
        System.out.println("the volume is "+volume);
    }
}
