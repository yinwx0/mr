package test;

import java.util.Scanner;

public class yin32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=0;
        int y=0;
        while (x!=2&y!=2){
            System.out.println("scissor(0),rock(1),paper(2)");
            int a = input.nextInt();
            int b = (int) Math.random()*3;
            if (a==b){
                System.out.println("平局");
            }
            else {
                int c =a-b;
                if (c==-1){
                    System.out.println("你赢了");
                    x++;
                }
                if (c==1){
                    System.out.println("电脑赢了");
                    y++;
                }
                if (c==2){
                    System.out.println("你赢了");
                    x++;
                }
                if (c==-2){
                    System.out.println("电脑赢了");
                    y++;
                }
            }
        }
    }
}
