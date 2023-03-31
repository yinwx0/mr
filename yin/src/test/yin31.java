package test;

import java.util.Scanner;

public class yin31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t ;
        System.out.println("请输入年份");
        int a = input.nextInt();
        System.out.println("请输入星期几");
        int b = input.nextInt();
        for (int i=1;i<=12;i++){
            System.out.println(a+"年");
            System.out.println(i+"月");
            System.out.println("日"+"\t"+"一"+"\t"+"二"+"\t"+"三"+"\t"+"四"+"\t"+"五"+"\t"+"六");
            int day = 0 ;
            switch (i){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                if (a%4==0&&a%100!=0 || a%400==0){
                        day = 29;
                }else {
                    day = 28;
                }
                break;
            }
            int n = 0;
            for (int y=0;y<b;y++){
                System.out.println("\t");
                n++;
            }
            for (int q=0;q<=day;q++){
                if (n%7!=0){
                    System.out.print(q+"\t");
                    n++;
                }
                else {
                    System.out.println(q+"\t");
                    n++;
                }
            }
            System.out.println();
        }
    }
}
