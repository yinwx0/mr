package test;

public class Flower {
    public static void main(String[] args) {
        int count = 0;
        for (int i=99; i<1000; i++) {
            int a=i%10;
            int b=(i/10)%10;
            int c=(i/10/10)%10;
            if (i==(a*a*a+b*b*b+c*c*c)) {
                count++;
                System.out.println("第" + count + "个水仙花数为:" + i);
            }
        }

    }
}
