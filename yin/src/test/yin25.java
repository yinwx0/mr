package test;

import java.util.Scanner;

public class yin25 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        double up = 0;
        double down = 0;
        for (int i=1;i<=10;i++){
            System.out.println("请输入第" + i + "位顾客的年龄：");
            int age1 = input1.nextInt();
            if (age1>0&&age1<30) down++;
            if (age1>=30) up++;
        }
        System.out.println("30岁以下的比例是：" + down*10 + "%");
        System.out.println("30岁以上的比例是：" + up*10 + "%");
    }
}
