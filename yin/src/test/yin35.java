package test;

import java.security.Key;
import java.util.Scanner;

public class yin35 {
    public static void main(String[] args) {
        double[][]a=new double[3][4];
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int x=0;x<3;x++){
            for (int y=0;y<4;y++){
                a[x][y]=input.nextDouble();
            }
        }
        double b=0;
        double c=0;
        double d=0;
        double e=0;
        for (int i=0;i<3;i++){
            b+= a[i][0];
            c+= a[i][1];
            d+= a[i][2];
            e+= a[i][3];
            System.out.println("第1列的和为"+b+"\n");
            System.out.println("第2列的和为"+c+"\n");
            System.out.println("第3列的和为"+d+"\n");
            System.out.println("第4列的和为"+e+"\n");

        }


    }
}
