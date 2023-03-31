package test;

import java.util.Scanner;

public class yin10 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入当前的华氏温度：");
        int a = 32;
        double hua = i.nextDouble();
        double b = hua-a;
        double c = b/1.8;
        System.out.println("当前的摄氏温度是："+c);
    }
}
