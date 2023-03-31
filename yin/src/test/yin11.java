package test;

import java.util.Scanner;

public class yin11 {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
                    Scanner a = new Scanner(System.in) ;
                    System.out.println("输入金额:");
                    double b = 0;
                    double n = 0;
                    if (a.hasNextDouble()) {
                        b = a.nextDouble();
                        System.out.println("输入月数:");
                        n = a.nextDouble();
                    } else {
                        System.out.println("请重新输入：");
                    }
                    double r = 0;
                    for (int i = 0; i < n; i++) {
                        r = (r + b) * 1.00417;
                    }
                    System.out.println("最终所得金额 $" + r);
                }
            }


