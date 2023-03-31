package test;

import java.util.Scanner;

public class yin15 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入是否是会员：是(y)/否（f）");
        String a = scan1.next();
        String y;
        if ( a.equals("y")) {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("请输入购物金额：");
            double z1 =scan2.nextDouble();
            if ( z1>=200){
                double r = z1*0.75;
                System.out.println("实付金额："+ r );
            }else{
                double r1 = z1*0.8;
                System.out.println("实付金额："+ r1 );
            }
        }else if (a.equals("f")){
            System.out.println("请输入购物金额：");
            Scanner scan3 =new Scanner(System.in);
            double z2 = scan3.nextDouble();
            if (z2>=100){
                double R2 =z2*0.9;
                System.out.println("实际支付："+R2);
            }else{
                System.out.println("实际支付："+z2);
            }


        }


    }
}
