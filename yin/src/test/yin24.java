package test;

import java.util.Scanner;

public class yin24 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=100;i++){
            if(i%3!=0){
                sum += i;
            }
        }
        System.out.println("1-100之间不能被3整除的数之和为：" + sum);
    }}
