package test;

import java.util.Scanner;

public class yin16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入会员积分：");
        int a = scan.nextInt();
        if ( a < 2000 ){
            double b = 0.9 ;
            System.out.println("该会员享有的折扣是："+ b );
        }else if ( 2000 <= a && a < 4000 ){
            double c = 0.8;
            System.out.println("该会员享有的折扣是："+ c );
        }else if ( 4000 <= a && a < 8000 ){
            double d = 0.7;
            System.out.println("该会员享有的折扣是："+ d );
        }else if ( a >=8000 ){
            double e = 0.6;
            System.out.println("该会员享有的折扣是："+ e );
        }




    }
}
