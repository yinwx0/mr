package test;

public class yin05 {
    public static void main(String[] args) {
        int a=8461;
        int b=a % 10;
        System.out.println("个位数是："+b);
        int c=a % 100;
        int d=(c-b)/10;
        System.out.println("十位数是："+d);
        int e=a % 1000;
        int f=(e-c)/100;
        System.out.println("百位数是："+f);
        int g=(a-e)/1000;
        System.out.println("千位数是："+g);


    }
}
