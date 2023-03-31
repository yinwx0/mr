package test;

import java.util.Scanner;

public class yin02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name=scan.next();
        System.out.println("请输入年龄：");
        byte age=scan.nextByte();
        System.out.println(name+age);
        scan.close();
    }

}
