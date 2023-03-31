package myShopping.management;

import java.util.Scanner;

public class VerifyEqual {

    //验证管理员的用户名和密码是否相等
    public boolean verify(String username, String password) {
        Scanner scan1 = new Scanner(System.in);
        for (int count = 0; count < 3; ) {
            System.out.println("请输入用户名：");
            String username1 = scan1.next();
            System.out.println("请输入密码：");
            String password1 = scan1.next();
            if (username1.equals(username) && password1.equals(password)) {
                System.out.println("欢迎您：" + username1);
                break;
            } else {
                System.out.println("用户名或密码输入错误");
                System.out.println("请重新输入:");
                count++;
            }
        }
        return false;
    }
}
