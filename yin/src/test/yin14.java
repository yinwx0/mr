package test;

import java.util.Scanner;

public class yin14 {
    public static void main(String[] args) {
        int random = (int)(Math.random()*10);
        System.out.println("随机数为：" + random);
        Scanner i = new Scanner(System.in);
        System.out.println("请输入会员号：");
        int a = 0 ;
        a = i.nextInt();
        if ( a>999 && a<10000 ){
            int b = a / 10 % 10;
            if ( b == random){
                System.out.println( a + "是幸运客户");
            }else {
                System.out.println("感谢您的支持");
            }
        }

    }
}
