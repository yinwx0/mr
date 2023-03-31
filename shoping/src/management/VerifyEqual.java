package management;

import java.util.Scanner;

public class VerifyEqual {
    /*
     * 空构造方法
     */
    public VerifyEqual() {
    }

    /*
     * 执行验证的方法
     */
    public boolean verify(String s, String s1) {

        // 由用户输入用户名
        System.out.print("请输入用户名：");
        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();

        // 由用户输入密码
        System.out.print("请输入密码：");
        scanner = new Scanner(System.in);
        String s3 = scanner.next();

        // 判断用户输入的信息是否和已有的信息一致
        return s2.equals(s) && s1.equals(s3);
    }
}

