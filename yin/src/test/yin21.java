package test;

import java.util.Scanner;

public class yin21 {
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShopping管理系统");
        System.out.println("******************************************");
        System.out.println("1.客 户 信 息 管 理");
        System.out.println("2.购 物 结 算");
        System.out.println("3.真 情 回 馈");
        System.out.println("4.注 销");
        System.out.println("******************************************");
        Scanner scan1 = new Scanner(System.in);
        int a;int b;
            System.out.println("请选择，输入数字：");
            a = scan1.nextInt();
            do {
                if (a == 1) {
                            System.out.println("执行客户信息管理");
                }else if ( a == 2){
                            System.out.println("执行购物结算");
                }else if ( a == 3) {
                    System.out.println("执行真情回馈");
                }else if ( a == 4) {
                    System.out.println("执行注销");
                }else{
                    System.out.println("输入错误，请重新输入数字：");
                    a = scan1.nextInt();
                }
            }while ( a < 0 & a > 5);

        }
    }
