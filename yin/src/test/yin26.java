package test;

import java.util.Scanner;

public class yin26 {
    public static void main(String[] args) {
        int a = 0;
        int i ;
        for (i=1 ; i<=10 ; i++){
            if (i % 2!= 0){
                continue;
            }
            a = a + i ;
        }
        System.out.println("所有偶数和是"+a);
    }
}
