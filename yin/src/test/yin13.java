package test;

import java.util.Scanner;

public class yin13 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("请输入会员号（<4位整数）：");
        int a = 0 ;
        String b ;
        int c = 0 ;
        a = number.nextInt();
        if ( a < 10000 && a > 999 ){
            System.out.println("请输入会员生日（月/日<用两位数表示>）：");
            b = number.next();
            System.out.println("请输入积分：");
            c = number.nextInt();
            System.out.println("已录入的会员信息是：" + a + "\t\t\t" + b + "\t\t\t" + c);



        }else {
            System.out.println("客户号是无效会员号！");
            System.out.println("录入信息失败！");
        }


    }


}
