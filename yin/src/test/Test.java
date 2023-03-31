package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int[] a = new int[10];
        init(a);
        max(a);
        search(a);
    }

    public static void init(int[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("输入数据初始化数组：");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
    }
    public static void max(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("数组中最大元素值:" + max);
    }
    public static void search(int[] a){
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        boolean b1 = false;
        for (int i = 0; i < a.length; i++) {
            if (b==a[i]) b1=true;
        }
        if (b1) {
            System.out.println("此数包含在该数组中");
        } else {
            System.out.println("此数不包含在该数组中");
        }
    }
    }

