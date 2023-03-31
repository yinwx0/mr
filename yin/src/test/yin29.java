package test;

import java.util.Scanner;

public class yin29 {
    public static void main(String[] args) {
        int n=0,i=1;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        n = scan1.nextInt();
        for (i=1;i<=n;i++){
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for (int t =i;t>0;t--){
                System.out.print(t);
            }
            for (int p =1;p<i;p++){
                System.out.print(p+1);
            }
            for (int j =n-1;j>0;j--){
                System.out.print("");
            }
            System.out.println();
        }
    }
}
