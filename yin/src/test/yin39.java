package test;

import java.util.Scanner;

public class yin39 {
    public static void main(String[] args) {
        double[][] array1 = new double[3][3];
        double[][] array2 = new double[3][3];
        Scanner scan = new Scanner(System.in);
        //输出第一个矩阵
        System.out.println("Enter matrix1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array1[i][j] = scan.nextDouble();
                    }
                }
        //输出第二个矩阵
        System.out.println("Enter matrix2:");
        for (int i = 0; i < 3; i++) {
            for(int j = 0;j < 3; j++) {
        array2[i][j]=scan.nextDouble();
        }
        }
        out(array1,array2,addMatrix(array1,array2));
        }

    public static double[][] addMatrix(double[][] array1, double[][] array2) {
        double[][] array3 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        //两个矩阵相加输出第三个矩阵
        return array3;
    }
    static void out(double[][] array1,double[][] array2,double[][] array3){
        //打印数组array1元素
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(array1[i][j] + " ");
            }
            //打印数组array1与数组array2之间的空格与+
            if (i != 1) {
                System.out.print("     ");
            } else {
                System.out.print("  +  ");
            }

            //打印数组array2
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(array2[i][j] + " ");
            }
            //打印数组array2与数组array3之间的空格和=
            if (i != 1) {
                System.out.print("     ");
            } else {
                System.out.print("  =  ");
            }
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        }
    }


