import java.util.Scanner;

public class Feet {
    public static void main (String []args){
        System.out.println("enter a value for feet: ");
        Scanner scan = new Scanner(System.in);
        double value = scan.nextDouble();
        double meter = value * 0.305;
        System.out.println(value+" feet is "+meter +" meters");
    }
}
