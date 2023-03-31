package test;

public class yin19 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
    static void test1(){
        int sum = 0 ;
        for ( int i = 1; i<=100; i++){
            if (i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("sum="+sum);
    }
    static void test2(){
        int a = 0;
        for (int i = 2 ; i < 100 ; i++){
            boolean b = true;
            for (int j = 2 ; j < i ; j++){
                if (i%j==0){
                    b =false;
                    break;
                }
            }
            if (b){
                a++;
                System.out.println(i+" ");
            }
        }
    }
    static void test3(){
        

    }
    static void test4(){

    }

}
