package test;

import java.util.Scanner;

public class yin18 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        int a = scan1.nextInt();
        if ( a > 200 ){
            switch (a){
                case 1:
                    System.out.println("满50元，加2元换购百事可乐饮料1瓶");
                case 2:
                    System.out.println("满100元，加3元换购");
                case 3:
                    System.out.println("满100元，");
            }
        }
    }
}
