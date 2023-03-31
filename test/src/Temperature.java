import java.util.Scanner;

public class Temperature {
    public static void main(String []args) {
        System.out.println("enter a degree in celsius : ");
        Scanner scan = new Scanner(System.in);
        double temper = scan.nextDouble();
        double temper1 = (9.0 / 5) * temper + 32;
        System.out.println(temper+" celsius is "+temper1+" fahrenheit");

    }
}
