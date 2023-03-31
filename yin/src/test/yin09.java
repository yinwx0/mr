package test;

import java.util.Scanner;

public class yin09 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("输出互换前手中的卡牌：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("左手中的纸牌：\t\t\t"+a);
        System.out.println("右手中的纸牌：\t\t\t"+b);
        int c = b;
        int d = a;
        System.out.println("输出互换后手中的纸牌：");
        System.out.println("左手中的纸牌：\t\t\t"+c);
        System.out.println("右手中的纸牌: \t\t\t"+d);

    }
}
