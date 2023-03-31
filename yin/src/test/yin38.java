package test;

import java.util.Random;
import java.util.Scanner;

public class yin38 {
    public static void main(String[] args) {
        String y = null;
        String jixu;
        String yonghu=null;
        String mima=null;
        String yonghu1;
        String mima1;
        Random ran1 = new Random();
        do {
            System.out.println("*****欢迎进入奖客富翁系统*****");
            System.out.println("         1.注册");
            System.out.println("         2.登录");
            System.out.println("         3.抽奖");
            System.out.println("**************************");
            Scanner scan1 = new Scanner(System.in);
            System.out.print("请选择菜单：");
            int choose = scan1.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("<奖客富翁系统>注册");
                    System.out.println("请填写个人注册信息：");
                    System.out.println("用户名：");
                    yonghu = scan1.next();
                    System.out.println("密码:");
                    mima = scan1.next();
                    System.out.println("注册成功，请记好您的会员卡号");
                    System.out.println("用户名\t\t\t密码\t\t\t会员卡号");
                    int kahao = (int) (Math.random() * 9000+1000);
                    System.out.println(yonghu + "\t\t\t" + mima + "\t\t\t" + kahao);
                    break;
                case 2:
                    System.out.println("<奖客富翁系统>登录");
                    for (int count = 0; count < 3; ) {
                        System.out.println("请输入用户名：");
                        yonghu1 = scan1.next();
                        System.out.println("请输入密码：");
                        mima1 = scan1.next();
                        //判断是否用户和密码正确
                        if (yonghu1.equals(yonghu) && mima1.equals(mima)) {
                            System.out.println("欢迎您：" + yonghu1);
                            break;
                        } else {
                            System.out.println("用户名或密码输入错误");
                            System.out.println("请重新输入:");
                            count++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("<奖客富翁系统>抽奖");
                    System.out.println("请输入您的会员卡号：");
                    int kahao1 = scan1.nextInt();
                    int[] luck = new int[5];
                    int i;
                    //随机五个幸运数字
                    for (i = 0; i < luck.length; i++) {
                        luck[i] = (int) (Math.random() * 9000+1000);
                        System.out.println("本日的幸运数字为：" + luck[i]);
                    }
                    //判断是否为幸运客户
                    for (i = 0; i < luck.length; i++) {
                    if(kahao1 !=luck[i]){
                        System.out.println("抱歉！您不是今日的幸运用户！");
                        break;
                    }else {
                        System.out.println("恭喜您为今日的幸运用户！");
                    }
                    }
                    break;
                default:
                    System.out.println("您的输入有误！");
                    break;
            }
            System.out.println("继续吗？（y/n）:");
            jixu = scan1.next();
        } while (jixu.equals("y"));
        System.out.println("系统退出，谢谢！");


    }
    }
