package test;

import java.util.Scanner;

public class yin27 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int number = 0;
        String birthday = "";
        int jifen = 0;
        for (int i =0 ; i<=3 ; i++){
            System.out.println("请输入会员号：");
            number = scan1.nextInt();
            System.out.println("请输入会员生日：");
            birthday =scan1.next();
            System.out.println("请输入会员积分：");
            jifen = scan1.nextInt();
            int a = number/1000;
            if (a<1){
                System.out.println("客户号"+number+"是无效会员号！");
                System.out.println("录入信息失败");
                continue;
            }
            System.out.println("您录入的会员信息是："+number+"\t"+birthday+"\t"+jifen);

        }


    }
}
