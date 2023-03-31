package test;

import java.util.Scanner;

public class yin06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个小写字母：");
        char a = input.next().charAt(0);
        char b = (char) (a-32);
        System.out.println("小写字母："+a);
        System.out.println("大写字母："+b);

    }
}
