package quation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入a，b，c：");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        //创建对象并调用有参构造方法来初始化abc，此时abc等于输入的数
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        //判别式
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("x1="+quadraticEquation.getRoot1());
            System.out.println("x2="+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("x1=x2="+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots.");
        }

    }
}