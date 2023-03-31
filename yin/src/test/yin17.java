package test;

import java.util.Scanner;

public class yin17 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t欢迎使用购物系统");
        System.out.println("1.登陆系统");
        System.out.println("2.退出");
        System.out.println("*******************");
        System.out.println("请选择，输入数字：");
        int a = scan1.nextInt();
        switch (a){
            case 1:
                System.out.println("********主菜单********");
                System.out.println("1.客户信息管理");
                System.out.println("2.购物结算");
                System.out.println("3.真情回馈");
                System.out.println("4.注销");
                System.out.println("请选择，输入数字：");
                Scanner scan2 = new Scanner(System.in);
                int b = scan2.nextInt();
                switch  (b){
                    case 1:
                        System.out.println("********客户信息管理********");
                        System.out.println("1.显示所有客户信息");
                        System.out.println("2.添加客户信息");
                        System.out.println("3，修改客户信息");
                        System.out.println("4.查询客户信息");
                        break;
                    case 3:
                        System.out.println("********真情回馈********");
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.生日问候");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }


    }
}
