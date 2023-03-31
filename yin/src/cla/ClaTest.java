package cla;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入课程代号： （1-3）");
        try {
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("语文");
                    System.out.println("打印课程完毕");
                    break;
                case 2:
                    System.out.println("数学");
                    System.out.println("打印课程完毕");
                    break;
                case 3:
                    System.out.println("英语");
                    System.out.println("打印课程完毕");
                    break;
                default:
                    System.err.println("请输入数字1-3");
            }
        }catch (InputMismatchException e) {
            System.err.println("请输入数字1-3");
            e.printStackTrace();
        }finally {
            System.out.println("欢迎提出您的建议");
        }

    }
}
