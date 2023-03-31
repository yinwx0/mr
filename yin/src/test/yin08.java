package test;

public class yin08 {
    public static void main(String[] args) {
        int a = 245;
        int b = 2;
        int c = 490;
        int d = 570;
        int e = 1;
        int f = 320;
        System.out.println("*******消费单*******");
        System.out.println("购买物品\t\t\t单价\t\t\t\t\t个数\t\t\t\t\t金额");
        System.out.println("T恤\t\t\t\t\t￥"+a+"\t\t\t\t\t"+b+"\t\t\t\t\t￥"+c);
        System.out.println("网球鞋\t\t\t\t￥"+d+"\t\t\t\t\t"+e+"\t\t\t\t\t￥"+d);
        System.out.println("网球拍\t\t\t\t￥"+f+"\t\t\t\t\t"+e+"\t\t\t\t\t￥"+f);
        System.out.println("\t\t\t\t\t\t\t\t\t");
        System.out.println("折扣：\t\t\t\t\t8折");
        double g = c+d+f;
        System.out.println("消费总金额\t\t\t￥"+g);
        System.out.println("实际交费");


    }
}
